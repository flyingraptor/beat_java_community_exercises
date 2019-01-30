package co.thebeat.ExerciseQ.UserTests;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface UserAPI {

    @POST("public-api/users")
    Call<CreateUserResponse> createUser(@Header("Authorization") String authorizationHeader,
                                        @Body RequestBody requestBody);
}
