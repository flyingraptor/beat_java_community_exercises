package co.thebeat.ExerciseQ.UserTests;

import co.thebeat.ExerciseQ.UserTests.Read.GetMultiUserResponse;
import co.thebeat.ExerciseQ.UserTests.Read.GetMultiUserResponseResult;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class WebsiteURLProperlyEndsTest {

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
    public void testValidateWebsiteURLEnd() throws IOException, InterruptedException {

        int counter = 0;
        for (short page = 1; page < 88; page++) {

            Thread.sleep(2000);
            System.out.println("Current Page: " + page);


            //Execute the request
            Call<GetMultiUserResponse> getFilteredByNameAPICall = userAPI.getUsersByPage(CREDENTIALS, page);
            Response<GetMultiUserResponse> returnUsersResponse = getFilteredByNameAPICall.execute();


            //Check the response
            if (returnUsersResponse.isSuccessful()) {

                GetMultiUserResponse responseBody = returnUsersResponse.body();
                ArrayList<GetMultiUserResponseResult> result = responseBody.getResult();

                String pattern = "\\.+[aA-zZ]{2,5}$";

                Pattern r = Pattern.compile(pattern);


                for (int i = 0; i < result.size(); i++) {

                    GetMultiUserResponseResult userRecord = result.get(i);

                    Matcher m = r.matcher(userRecord.getWebsite());
                    if (!m.find()) {
                        counter++;

                        }
                    }

                } else {
                assertTrue(false);
            }

        }
        assertEquals(0, counter);
    }
}


