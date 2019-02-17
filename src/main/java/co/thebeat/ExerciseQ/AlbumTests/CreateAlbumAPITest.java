package co.thebeat.ExerciseQ.AlbumTests;

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

public class CreateAlbumAPITest {

    private Retrofit retrofitClient;

    private RequestBody requestBody;

    private AlbumAPI AlbumAPI;

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
    public void testAlbumUser() throws IOException {

        prepareAlbumCreationRequest();

        //Execute the request
        Call<CreateAlbumResponse> userCall = AlbumAPI.createAlbum(CREDENTIALS, requestBody);
        Response<CreateAlbumResponse> createAlbumResponse = userCall.execute();

        //Check the response
        if (createAlbumResponse.isSuccessful()) {
            System.out.println("Success!!");
            CreateAlbumResponse responseBody = createAlbumResponse.body();
            //String createdAlbumId = responseBody.getResult().getId();
            //String returnedTitleFromCreation = responseBody.getResult().getTitle();
            System.out.println(responseBody.getMetadata().getCode());
            System.out.println(responseBody.getMetadata().getMessage());
            System.out.println(responseBody.getMetadata().isSuccess());
            System.out.println(responseBody.getResult().getTitle());
        } else {
            System.out.println("Failed!!");
        }

    }

    private void prepareAlbumCreationRequest() {
        //Create the request
        AlbumAPI = retrofitClient.create(AlbumAPI.class);
        requestBody = RequestBody.create(MediaType.parse("application/json"),
                "{\"user_id\":\"1156\",\"title\":\"Fuego\"}");
    }
}
