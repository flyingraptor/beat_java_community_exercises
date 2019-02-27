package co.thebeat.ExerciseQ.UserTests;

import co.thebeat.ExerciseQ.UserTests.Responses.Read.GetMultiUsersResponse;
import co.thebeat.ExerciseQ.UserTests.Responses.Read.GetMultiUsersResponseResult;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GetUserFilteredByNameTest {

    private static Retrofit retrofitClient;

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
    public void testGet4UsersFilteredByName() throws IOException {

        //Execute the request
        Call<GetMultiUsersResponse> getFilteredUserAPICall = userAPI.getUserFilteredByName(CREDENTIALS,"niko");
        Response<GetMultiUsersResponse> getMultiUsersResponse = getFilteredUserAPICall.execute();

        //Check the response
        if(getMultiUsersResponse.isSuccessful()) {

            GetMultiUsersResponse responseBody = getMultiUsersResponse.body();
            ArrayList<GetMultiUsersResponseResult> result = responseBody.getResult();

            //Test that the returned results are 4
            assertEquals(4,result.size());

            //Check that every result contains name with Niko
            for(int i=0; i<result.size(); i++) {

                String name = result.get(i).getName();

                if(!StringUtils.containsIgnoreCase(name,"NiKo")) {
                    assertTrue(false);
                }
            }

        } else {
            assertTrue(false);
        }
    }
}
