package co.thebeat.ExerciseQ.UserTests;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.RequestBody;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GetUserFilteredByNameTest {
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
    public void testGetUserByName() throws IOException {

        Call<GetUserFilteredByNameResponse> getUserFilteredByNameResponseCall = userAPI.getUserByName(CREDENTIALS, "Niko");
        Response<GetUserFilteredByNameResponse> getUserFilteredByNameResponse = getUserFilteredByNameResponseCall.execute();

        if(getUserFilteredByNameResponse.isSuccessful()) {

            GetUserFilteredByNameResponse responseBody = getUserFilteredByNameResponse.body();
            ArrayList<GetUserFilteredByNameResponseResult> result = responseBody.getResult();

            for(int i=0; i<result.size(); i++){

                String name = result.get(i).getName();

                if(!StringUtils.containsIgnoreCase(name, "NikO")){

                    assertTrue(false);

                }
            }

        } else {

            System.out.println("false");

        }

    }
}
