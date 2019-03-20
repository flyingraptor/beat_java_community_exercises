package co.thebeat.ExerciseQ.AlbumTests;

import co.thebeat.ExerciseQ.AlbumTests.AlbumAPI;
import co.thebeat.ExerciseQ.AlbumTests.Read.GetSingleAlbumResponse;
import co.thebeat.ExerciseQ.AlbumTests.Create.CreateAlbumResponse;
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
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateAlbumAPITest {

    private Retrofit retrofitClient;

    private RequestBody requestBody;

    private AlbumAPI albumAPI;

    private String createdAlbumId;

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
        albumAPI = retrofitClient.create(AlbumAPI.class);
    }

    @Test
    public void testCreateAlbum() throws IOException {

        prepareAlbumCreationRequest();

        //Execute the request
        Call<CreateAlbumResponse> postAlbumAPICall = albumAPI.createAlbum(CREDENTIALS, requestBody);
        Response<CreateAlbumResponse> createAlbumResponse = postAlbumAPICall.execute();

        //Check the response
        if (createAlbumResponse.isSuccessful()) {
            System.out.println("Success!!");
            CreateAlbumResponse responseBody = createAlbumResponse.body();
            createdAlbumId = responseBody.getResult().getId();
            String returnedTitleFromCreation = responseBody.getResult().getTitle();

            Call<GetSingleAlbumResponse> getAlbumAPICall = albumAPI.getAlbumById(CREDENTIALS, createdAlbumId);
            Response<GetSingleAlbumResponse> httpResponse = getAlbumAPICall.execute();
            GetSingleAlbumResponse getCreateAlbumResponse = httpResponse.body();



        //Test
        assertEquals(createdAlbumId, getCreateAlbumResponse.getResult().getId());
        assertEquals(returnedTitleFromCreation, getCreateAlbumResponse.getResult().getTitle());
        }

    }

    private void prepareAlbumCreationRequest() {
        //Create the request
        requestBody = RequestBody.create(MediaType.parse("application/json"),
                "{\"user_id\":\"1224\"," +
                        "\"title\":\"album title\"}");
    }

    @Test
    public void testPutAlbum() throws IOException {

        prepareAlbumUpdateRequest();

        //Execute the PUT request
        Call<PutAlbumResponse> upadateAlbumAPICall = albumAPI.updateAlbum(CREDENTIALS, requestBody, createdAlbumId);
        Response<PutAlbumResponse> putAlbumResponse = upadateAlbumAPICall.execute();

        //Check the PUT reponse
        if (putAlbumResponse.isSuccessful()) {
            System.out.println("Success!!");
            PutAlbumResponse responseBody = putAlbumResponse.body();
            String updatedAlbumId = responseBody.getResult().getId();
            String returnedTitleFromUpdate = responseBody.getResult().getTitle();

            Call<GetSingleAlbumResponse> getAlbumAPICall = albumAPI.getAlbumById(CREDENTIALS, updatedAlbumId);
            Response<GetSingleAlbumResponse> httpResponse = getAlbumAPICall.execute();
            GetSingleAlbumResponse getPutAlbumResponse = httpResponse.body();

            //Test
            assertEquals(updatedAlbumId, getPutAlbumResponse.getResult().getId());
            assertEquals(returnedTitleFromUpdate, getPutAlbumResponse.getResult().getTitle());


        }


    }
    private void prepareAlbumUpdateRequest() {
        //Create the request

        requestBody = RequestBody.create(MediaType.parse("application/json"),
                "{\"user_id\":\"1224\"," +
                        "\"title\":\"album title2\"}");
    }
}
