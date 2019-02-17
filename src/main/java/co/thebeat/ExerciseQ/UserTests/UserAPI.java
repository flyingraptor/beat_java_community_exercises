package co.thebeat.ExerciseQ.UserTests;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.GET;

public interface UserAPI {

    @POST("public-api/users")
    Call<CreateUserResponse> createUser(@Header("Authorization") String authorizationHeader,
                                        @Body RequestBody requestBody);

    @GET("public-api/users/{user_id}")
    Call<CreateUserResponse> getUserId(@Header("Authorization") String authorizationHeader,
                                       @Path("user_id") String id);
}
