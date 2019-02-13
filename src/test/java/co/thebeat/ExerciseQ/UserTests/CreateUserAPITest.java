package co.thebeat.ExerciseQ.UserTests;

import co.thebeat.ExerciseQ.AlbumTests.AlbumResponse;
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

//    @Test
//    public void testCreateUser() throws IOException {
//
//        prepareUserCreationRequest();
//
//        //Execute the request
//        Call<CreateUserResponse> userAPICall = userAPI.createUser(CREDENTIALS,requestBody);
//        Response<CreateUserResponse> httpResponse = userAPICall.execute();
//
//        //Check the response
//        if(httpResponse.isSuccessful()) {
//            System.out.println("Success!!");
//            CreateUserResponse responseBody = httpResponse.body();
//            System.out.println(responseBody.getMetadata().getCode());
//            System.out.println(responseBody.getMetadata().getMessage());
//            System.out.println(responseBody.getMetadata().isSuccess());
//        } else {
//            System.out.println("Failed!!");
//        }
//
//    }


    @Test
    public void testCreateFullUser() throws IOException {

        prepareUserCreationRequest();

        //Execute the request
        Call<CreateUserResponse> userAPICall = userAPI.createUser(CREDENTIALS,requestBody);
        Response<CreateUserResponse> createUserResponse = userAPICall.execute();

        //Check the response
        if(createUserResponse.isSuccessful()) {
            System.out.println("Success!!");
            CreateUserResponse responseBody = createUserResponse.body();

            String userId = responseBody.getResult().getId();
            String fullUserName = responseBody.getResult().getName();
            String fullUserGender = responseBody.getResult().getGender();
            String fullUserEmail = responseBody.getResult().getEmail();
            String fullUserAddress = responseBody.getResult().getAddress();
            String fullUserStatus = responseBody.getResult().getStatus();

            userAPICall = userAPI.getUser( CREDENTIALS, userId );
            Response<CreateUserResponse> httpResponse = userAPICall.execute();
            CreateUserResponse getUserResponse = httpResponse.body();

            //Test
            assertEquals(fullUserName, getUserResponse.getResult().getName());
            assertEquals(fullUserGender,getUserResponse.getResult().getGender());
            assertEquals( fullUserAddress,getUserResponse.getResult().getAddress());
            assertEquals(fullUserEmail, getUserResponse.getResult().getEmail());

            assertEquals(fullUserStatus,getUserResponse.getResult().getStatus());

        } else {
            System.out.println("Failed!!");
        }

    }

    private void prepareUserCreationRequest() {
        //Create the request
        requestBody = RequestBody.create(MediaType.parse("application/json"),
                "{\"first_name\":\"messi\",\"last_name\":\"messi\",\"gender\":\"male\",\"email\":\"konstnatakoi2141.usman@gmail.com\",\"address\":\"testeteste\",\"status\":\"inactive\"}");
    }
}
