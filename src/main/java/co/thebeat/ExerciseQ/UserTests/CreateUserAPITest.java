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
    }

    @Test
    public void testCreateUser2() throws IOException {

        prepareUserCreationRequest();

        //Execute the request
        Call<CreateUserResponse> userCall = userAPI.createUser(CREDENTIALS, requestBody);
        Response<CreateUserResponse> createUserResponse = userCall.execute();

        //Check the response
        if (createUserResponse.isSuccessful()) {
            System.out.println("Success!!");
            CreateUserResponse responseBody = createUserResponse.body();
            String createdUserId = responseBody.getResult().getId();
            String returnedTitleFromCreation = responseBody.getResult().getName();

            System.out.println(createdUserId);

            userCall = userAPI.getUserId(CREDENTIALS, createdUserId);
            Response<CreateUserResponse> httpResponse = userCall.execute();
            CreateUserResponse getUserResponse = httpResponse.body();


            //Test
            assertEquals(createdUserId, getUserResponse.getResult().getId());
            assertEquals(returnedTitleFromCreation, getUserResponse.getResult().getName());

        } else {
            assertTrue(false);
        }

    }

    private void prepareUserCreationRequest() {
        //Create the request
        userAPI = retrofitClient.create(UserAPI.class);
        requestBody = RequestBody.create(MediaType.parse("application/json"),
                "{\"first_name\":\"Cleveland\",\"last_name\":\"XXXX\",\"gender\":\"male\",\"dob\":\"1988-09-13\",\"email\":\"shields.danielle111@hartmann.org\",\"phone\":\"(650) 297-7813 x933\",\"website\":\"https://www.wiza.org/ab-officia-nesciunt-atque-consequuntur-consequatur-perspiciatis-dicta\",\"address\":\"1555 Lang Extensions Apt. 502\\nPort Kamronborough, MO 25754-5849\",\"status\":\"inactive\"}");
    }
}


