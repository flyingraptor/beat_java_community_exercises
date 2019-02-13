package co.thebeat.ExerciseQ.UserTests;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateUserAPITest {

    private Retrofit retrofitClient;

    private RequestBody requestBody;

    private UserAPI userAPI;

    private static final String CREDENTIALS = "Basic QVBRRVV4UkZMVjk5d3RJYnFNU3dnMlZBeVlMR1hQdThqWWdUOg==";

    @BeforeEach
    public void before() {
        //Initialize json converter using gson lib
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create(gson);

        //Initialize a retrofit client
        Retrofit.Builder retrofitClientBuilder = new Retrofit.Builder();
        retrofitClientBuilder.baseUrl("https://gorest.co.in");
        retrofitClientBuilder.addConverterFactory(gsonConverterFactory);
        retrofitClient = retrofitClientBuilder.build();
        userAPI = retrofitClient.create(UserAPI.class);
    }

    @Test
    public void testCreateUser() throws IOException {

        prepareUserCreationRequest();

        //Execute the request
        Call<UserResponse> createaUserAPICall = userAPI.createUser(CREDENTIALS,requestBody);
        Response<UserResponse> httpResponse = createaUserAPICall.execute();

        //Check the response
        if(httpResponse.isSuccessful()) {
            System.out.println("Success!!");
            UserResponse responseBody = httpResponse.body();


            String createdUserId = responseBody.getResult().getId();
            String returnedWebsiteFromCreation = responseBody.getResult().getWebsite();

            Call<UserResponse> getUserAPICall = userAPI.getUserById(CREDENTIALS, createdUserId);
            Response<UserResponse> httpGetResponse = getUserAPICall.execute();
            UserResponse getUserResponse = httpGetResponse.body();

            //Test
            assertEquals(createdUserId, getUserResponse.getResult().getId());
            assertEquals(returnedWebsiteFromCreation, getUserResponse.getResult().getWebsite());

        } else {
            assertTrue(false);
            System.out.println("Failed!!");
        }

    }

    private void prepareUserCreationRequest() {
        //Create the request
        requestBody = RequestBody.create(MediaType.parse("application/json"),
                "{\"first_name\":\"Electra\",\"last_name\":\"Lele\",\"gender\":\"female\",\"email\":\"user49394.s@test.com\",\"dob\":\"April 9 1979\",\"phone\":\"7428748738\",\"address\":\"Sina 11\",\"website\":\"http://twitter.com\",\"status\":\"active\"}");


    }
}
