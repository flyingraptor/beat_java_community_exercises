package co.thebeat.ExerciseQ.AlbumTests;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AlbumAPI {

    @POST("public-api/albums")
    Call<AlbumResponse> createAlbum(@Header("Authorization") String authorizationHeader,
                                    @Body RequestBody requestBody);

    @GET("public-api/albums/{album_id}")
    Call<AlbumResponse> getAlbumById(@Header("Authorization") String authorizationHeader,
                                     @Path("album_id") String albumId);
}
