package co.thebeat.ExerciseQ.UserTests;

import co.thebeat.ExerciseQ.UserTests.Responses.Read.GetSingleUserResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateUserAPITest {

    private static Retrofit retrofitClient;

    private RequestBody requestBody;

    private static UserAPI userAPI;

    private static final String CREDENTIALS = "Basic QVBRRVV4UkZMVjk5d3RJYnFNU3dnMlZBeVlMR1hQdThqWWdUOg==";

    @BeforeAll
    public static void before() {
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
        Call<CreateUserResponse> userAPICall = userAPI.createUser(CREDENTIALS,requestBody);
        Response<CreateUserResponse> createUserResponse = userAPICall.execute();

        CreateUserResponse responseBody = createUserResponse.body();

        //Check the response
        if(createUserResponse.isSuccessful()) {
            System.out.println("Success!!");
            String createdUserId = responseBody.getResult().getId();
            String returnedIdFromCreation = responseBody.getResult().getId();

            //Execute a GET with the received user id from POST
            Call<GetSingleUserResponse> getUserAPICall = userAPI.getUserById(CREDENTIALS, createdUserId);
            Response<GetSingleUserResponse> httpResponse = getUserAPICall.execute();
            GetSingleUserResponse getUserResponse = httpResponse.body();

            //Test that the returned object is the same entity created
            assertEquals(createdUserId, getUserResponse.getResult().getId());
            assertEquals(returnedIdFromCreation, getUserResponse.getResult().getId());

        } else {
            assertTrue(false);
        }

    }

    private void prepareUserCreationRequest() {
        //Create the request
        requestBody = RequestBody.create(MediaType.parse("application/json"),"{\"first_name\":\"Galatea Georgallis\",\"last_name\":\"Galatea Georgallis\",\"gender\":\"female\",\"dob\":\"16/03/99\",\"email\":\"galateiae92rreeeee000001@gmail.com\",\"phone\":\"8888999900\",\"website\":\"https://www.google.com\",\"address\":\"Manhattanos 19\",\"status\":\"active\"}");
    }
}
