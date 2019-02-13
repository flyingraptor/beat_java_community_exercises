package co.thebeat.ExerciseQ.UserTests;

import co.thebeat.ExerciseQ.AlbumTests.AlbumResponse;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface UserAPI {

    @POST("public-api/users")
    Call<CreateUserResponse> createUser(@Header("Authorization") String authorizationHeader,
                                        @Body RequestBody requestBody);

    @GET("public-api/users/{user-id}")
    Call<CreateUserResponse> getUser(@Header("Authorization") String authorizationHeader,
                          @Path( "user-id" ) String userId);
}
