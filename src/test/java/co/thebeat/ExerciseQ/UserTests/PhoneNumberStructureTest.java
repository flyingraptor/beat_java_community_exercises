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

public class PhoneNumberStructureTest {

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
    public void testValidatePhoneNumber() throws IOException {


        //Execute the request
        Call<GetMultiUserResponse> getFilteredByNameAPICall = userAPI.getAllUsers(CREDENTIALS);
        Response<GetMultiUserResponse> returnUsersResponse = getFilteredByNameAPICall.execute();

        //Check the response
        if (returnUsersResponse.isSuccessful()) {

            GetMultiUserResponse responseBody = returnUsersResponse.body();
            ArrayList<GetMultiUserResponseResult> result = responseBody.getResult();

            String pattern = "^((\\+1\\s\\(\\d{3}\\)\\s)|(\\d{3}-))\\d{3}-\\d{4}$";

            Pattern r = Pattern.compile(pattern);

            int counter = 0;

            for(GetMultiUserResponseResult userRecord : result) {

                Matcher m = r.matcher(userRecord.getPhone());
                if (!m.find()) {
                    counter++;
                }
            }

            assertEquals(0, counter);

        } else {
            assertTrue(false);
        }
    }
}
