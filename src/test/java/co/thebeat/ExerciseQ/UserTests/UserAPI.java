package co.thebeat.ExerciseQ.UserTests;

import co.thebeat.ExerciseQ.UserTests.Create.CreateUserResponse;
import co.thebeat.ExerciseQ.UserTests.Read.GetMultiUserResponse;
import co.thebeat.ExerciseQ.UserTests.Read.GetSingleUserResponse;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface UserAPI {

    @POST("public-api/users")
    Call<CreateUserResponse> createUser(@Header("Authorization") String authorizationHeader,
                                        @Body RequestBody requestBody);

    @GET("public-api/users/{user_id}")
    Call<GetSingleUserResponse> getUserById(@Header("Authorization") String authorizationHeader,
                                            @Path("user_id") String userId);

    @GET("public-api/users")
    Call<GetMultiUserResponse> getUserByName(@Header("Authorization") String authorizationHeader,
                                             @Query("name") String userName);

    @GET("public-api/users")
    Call<GetMultiUserResponse> getAllUsers(@Header("Authorization") String authorizationHeader);

    @GET("public-api/users")
    Call<GetMultiUserResponse> getUsersByPage(@Header("Authorization") String authorizationHeader,
                                              @Query("page") short pageNumber);
}

