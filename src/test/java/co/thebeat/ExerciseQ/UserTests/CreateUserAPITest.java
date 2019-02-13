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
        Call<CreateUserResponse> userAPICall = userAPI.createUser(CREDENTIALS,requestBody);
        Response<CreateUserResponse> httpResponse = userAPICall.execute();

        //Check the response
        if(httpResponse.isSuccessful()) {
            System.out.println("Success!!");
            CreateUserResponse responseBody = httpResponse.body();
            System.out.println(responseBody.getMetadata().getCode());
            System.out.println(responseBody.getMetadata().getMessage());
            System.out.println(responseBody.getMetadata().isSuccess());
        } else {
            System.out.println("Failed!!");
        }

    }

    private void prepareUserCreationRequest() {
        //Create the request
        requestBody = RequestBody.create(MediaType.parse("application/json"),
                "{\"first_name\":\"user0\"," +
                        "\"last_name\":\"user0\"," +
                        "\"gender\":\"female\"," +
                        "\"email\":\"user1.s@test.com\"}");
    }
}
