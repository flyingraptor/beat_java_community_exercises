package co.thebeat.ExerciseQ.AlbumTests;

<<<<<<< HEAD
import co.thebeat.ExerciseQ.AlbumTests.Responses.Create.CreateAlbumResponse;
import co.thebeat.ExerciseQ.AlbumTests.Responses.Read.GetSingleAlbumResponse;
=======
import co.thebeat.ExerciseQ.AlbumTests.Create.CreateAlbumResponse;
import co.thebeat.ExerciseQ.AlbumTests.Read.GetSingleAlbumResponse;
import co.thebeat.ExerciseQ.AlbumTests.Update.PutAlbumResponse;
>>>>>>> raptis
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
<<<<<<< HEAD
=======

    @PUT("public-api/albums/{album_id}")
    Call<PutAlbumResponse> updateAlbum(@Header("Authorization") String authorizationHeader,
                                       @Body RequestBody resquestBody,
                                       @Path("album_id") String albumId);
>>>>>>> raptis
}
