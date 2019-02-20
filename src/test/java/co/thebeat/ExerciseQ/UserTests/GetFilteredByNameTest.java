package co.thebeat.ExerciseQ.UserTests;


import co.thebeat.ExerciseQ.AlbumTests.GetSingleAlbumResponseResult;
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
import retrofit2.http.Query;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GetFilteredByNameTest {

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
    public void testGetFilteredByName() throws IOException {


        //Execute the request
        Call<GetFilteredByNameResponse> getFilteredByNameAPICall = userAPI.getUserByName(CREDENTIALS, "Niko");
        Response<GetFilteredByNameResponse> returnUsersResponse = getFilteredByNameAPICall.execute();

        //Check the response
        if (returnUsersResponse.isSuccessful()) {
            System.out.println("Success!!");

            GetFilteredByNameResponse responseBody = returnUsersResponse.body();
            ArrayList<GetFilteredByNameResponseResult> result = responseBody.getResult();


            //Test that the returned results are 4
            assertEquals(4, result.size());


            //Check that every result contains name with niko
            for (int i = 0; i < result.size(); i++) {
                String name = result.get(i).getName();
                name = name.toLowerCase();

                if (!name.contains("Niko")) {
                    assertTrue(false);

                } else {
                assertTrue(false);
            }

        }}}}






