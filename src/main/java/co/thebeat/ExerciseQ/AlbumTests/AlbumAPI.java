package co.thebeat.ExerciseQ.AlbumTests;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.*;

public interface AlbumAPI {

    @POST("public-api/albums")
    Call<CreateAlbumResponse> createAlbum(@Header("Authorization") String authorizationHeader,
                                          @Body RequestBody requestBody);

    @GET("public-api/albums/{album_id}")
    Call<CreateAlbumResponse> getAlbumById(@Header("Authorization") String authorizationHeader,
                                           @Path("album_id") String albumId);
}

