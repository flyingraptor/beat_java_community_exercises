package co.thebeat.ExerciseQ.AlbumTests;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CreateAlbumAPI {

    @POST("public-api/albums")
    Call<CreateAlbumResponse> createAlbum(@Header("Authorization") String authorizationHeader,
                                    @Body RequestBody requestBody);

    @GET("public-api/albums/{album_id}")
    Call<GetSingleAlbumResponse> getAlbumById(@Header("Authorization") String authorizationHeader,
                                     @Path("album_id") String albumId);
}
