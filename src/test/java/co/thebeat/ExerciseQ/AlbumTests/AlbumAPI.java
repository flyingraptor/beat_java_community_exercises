package co.thebeat.ExerciseQ.AlbumTests;

import co.thebeat.ExerciseQ.AlbumTests.Create.CreateAlbumResponse;
import co.thebeat.ExerciseQ.AlbumTests.Delete.DeleteAlbumResponse;
import co.thebeat.ExerciseQ.AlbumTests.Read.GetSingleAlbumResponse;
import co.thebeat.ExerciseQ.AlbumTests.Update.PutAlbumResponse;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AlbumAPI {

    @Headers("Authorization: Basic QVBRRVV4UkZMVjk5d3RJYnFNU3dnMlZBeVlMR1hQdThqWWdUOg==")
    @POST("public-api/albums")
    Call<CreateAlbumResponse> createAlbum(@Body RequestBody requestBody);

    @Headers("Authorization: Basic QVBRRVV4UkZMVjk5d3RJYnFNU3dnMlZBeVlMR1hQdThqWWdUOg==")
    @GET("public-api/albums/{album_id}")
    Call<GetSingleAlbumResponse> getAlbumById(@Path("album_id") String albumId);

    @Headers("Authorization: Basic QVBRRVV4UkZMVjk5d3RJYnFNU3dnMlZBeVlMR1hQdThqWWdUOg==")
    @PUT("public-api/albums/{album_id}")
    Call<PutAlbumResponse> updateAlbum (@Body RequestBody requestBody,
                                        @Path("album_id") String albumId);

    @Headers("Authorization: Basic QVBRRVV4UkZMVjk5d3RJYnFNU3dnMlZBeVlMR1hQdThqWWdUOg==")
    @DELETE("public-api/albums/{album_id}")
    Call<DeleteAlbumResponse> deleteAlbum (@Path("album_id") String albumId);

}
