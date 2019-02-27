package co.thebeat.ExerciseQ.AlbumTests;

import co.thebeat.ExerciseQ.AlbumTests.Delete.DeleteAlbumResponse;
import co.thebeat.ExerciseQ.AlbumTests.Create.CreateAlbumResponse;
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

import static org.junit.jupiter.api.Assertions.*;


public class DeleteAlbumAPITest {


    private static Retrofit retrofitClient;

    private RequestBody requestBody;

    private static AlbumAPI albumAPI;

    private String createdAlbumId;


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
    public void testDeleteAlbum() throws IOException {

        prepareAlbumCreationRequest();

        //Execute the CREATE request
        Call<CreateAlbumResponse> postAlbumAPICall = albumAPI.createAlbum(requestBody);
        Response<CreateAlbumResponse> createAlbumResponse = postAlbumAPICall.execute();
        CreateAlbumResponse createResponseBody = createAlbumResponse.body();
        createdAlbumId = createResponseBody.getResult().getId();

        //Execute the DELETE request
        Call<DeleteAlbumResponse> deleteAlbumAPICall = albumAPI.deleteAlbum(createdAlbumId);
        Response<DeleteAlbumResponse> deleteAlbumResponse = deleteAlbumAPICall.execute();

        //Check the DELETE response
        assertEquals (200,deleteAlbumResponse.code());
        assertNull(deleteAlbumResponse.body().getResult());

        }

    private void prepareAlbumCreationRequest() {
        //Create the request
        requestBody = RequestBody.create(MediaType.parse("application/json"),
                "{\"user_id\":\"1224\"," +
                        "\"title\":\"album title\"}");
    }

}

