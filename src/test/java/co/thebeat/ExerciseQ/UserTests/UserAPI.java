package co.thebeat.ExerciseQ.UserTests;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface UserAPI {

    @POST("public-api/users")
    Call<UserResponse> createUser(@Header("Authorization") String authorizationHeader,
                                  @Body RequestBody requestBody);

    @GET("public-api/users/{user_id}")
    Call<UserResponse> getUserById(@Header("Authorization") String authorizationHeader,
                                   @Path("user_id") String userId);
}

