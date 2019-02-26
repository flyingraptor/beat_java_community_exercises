package co.thebeat.ExerciseQ.AlbumTests;

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

public class CreateAlbumAPITest {

    private static Retrofit retrofitClient;

    private RequestBody requestBody;

    private static AlbumAPI albumAPI;

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
        albumAPI = retrofitClient.create(AlbumAPI.class);
    }

    @Test
    public void testCreateAlbum() throws IOException {

        prepareAlbumCreationRequest();

        //Execute the request
        Call<CreateAlbumResponse> albumAPICall = albumAPI.createAlbum(CREDENTIALS,requestBody);
        Response<CreateAlbumResponse> createAlbumResponse = albumAPICall.execute();

        //Check the response
        if(createAlbumResponse.isSuccessful()) {
            System.out.println("Success!!");
            CreateAlbumResponse responseBody = createAlbumResponse.body();
            String createdAlbumId = responseBody.getResult().getId();
            String returnedTitleFromCreation = responseBody.getResult().getTitle();

            //Execute a GET with the received album id from POST
            Call<GetSingleAlbumResponse> getAlbumAPICall = albumAPI.getAlbumById(CREDENTIALS, createdAlbumId);
            Response<GetSingleAlbumResponse> httpResponse = getAlbumAPICall.execute();
            GetSingleAlbumResponse getAlbumResponse = httpResponse.body();

            //Test that the returned object is the same entity created
            assertEquals(createdAlbumId, getAlbumResponse.getResult().getId());
            assertEquals(returnedTitleFromCreation, getAlbumResponse.getResult().getTitle());

        } else {
            assertTrue(false);
        }

    }

    private void prepareAlbumCreationRequest() {
        //Create the request
        requestBody = RequestBody.create(MediaType.parse("application/json"),
                "{\"user_id\":\"1224\"," +
                        "\"title\":\"album title\"}");
    }
}
