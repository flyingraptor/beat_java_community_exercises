package co.thebeat.ExerciseQ.UserTests;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;

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

           Call<GetSingleUserResponse> getUserAPICall = userAPI.getUserById(CREDENTIALS, createdUserId);
            Response<GetSingleUserResponse> httpResponse = getUserAPICall.execute();
           GetSingleUserResponse getUserResponse = httpResponse.body();

            //Test
            assertEquals(createdUserId, getUserResponse.getResult().getId());
            assertEquals(returnedIdFromCreation, getUserResponse.getResult().getId());

        } else {
            assertTrue(false);
        }

    }



    private void prepareUserCreationRequest() {
        //Create the request
        requestBody = RequestBody.create(MediaType.parse("application/json"),"{\"first_name\":\"Galatea Georgallis\",\"last_name\":\"Galatea Georgallis\",\"gender\":\"female\",\"dob\":\"16/03/99\",\"email\":\"galateiae90rrseeeee000001@gmail.com\",\"phone\":\"8888999900\",\"website\":\"https://www.google.com\",\"address\":\"Manhattanos 19\",\"status\":\"active\"}");

    }
}
