package co.thebeat.ExerciseQ.AlbumTests;

import co.thebeat.ExerciseQ.AlbumTests.Create.CreateAlbumResponse;
import co.thebeat.ExerciseQ.AlbumTests.Read.GetSingleAlbumResponse;
import co.thebeat.ExerciseQ.AlbumTests.Update.PutAlbumResponse;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AlbumAPI {

    @POST("public-api/albums")
    Call<CreateAlbumResponse> createAlbum(@Header("Authorization") String authorizationHeader,
                                          @Body RequestBody requestBody);

    @GET("public-api/albums/{album_id}")
    Call<GetSingleAlbumResponse> getAlbumById(@Header("Authorization") String authorizationHeader,
                                              @Path("album_id") String albumId);

    @PUT("public-api/albums/{album_id}")
    Call<PutAlbumResponse> updateAlbum(@Header("Authorization") String authorizationHeader,
                                       @Body RequestBody resquestBody,
                                       @Path("album_id") String albumId);
}
