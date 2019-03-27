package co.thebeat.ExerciseQ.UserTests;

<<<<<<< HEAD
import co.thebeat.ExerciseQ.UserTests.Responses.Create.CreateUserResponse;
import co.thebeat.ExerciseQ.UserTests.Responses.Read.GetMultiUsersResponse;
import co.thebeat.ExerciseQ.UserTests.Responses.Read.GetSingleUserResponse;
=======
import co.thebeat.ExerciseQ.UserTests.Create.CreateUserResponse;
import co.thebeat.ExerciseQ.UserTests.Read.GetMultiUserResponse;
import co.thebeat.ExerciseQ.UserTests.Read.GetSingleUserResponse;
>>>>>>> raptis
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface UserAPI {

    @POST("public-api/users")
    Call<CreateUserResponse> createUser(@Header("Authorization") String authorizationHeader,
                                        @Body RequestBody requestBody);

    @GET("public-api/users/{user_id}")
    Call<GetSingleUserResponse> getUserById(@Header("Authorization") String authorizationHeader,
<<<<<<< HEAD
                                            @Path("user_id") String id);

    @GET("public-api/users")
    Call<GetMultiUsersResponse> getUserFilteredByName(@Header("Authorization") String authorizationHeader,
                                                      @Query("name") String name);
=======
                                            @Path("user_id") String userId);

    @GET("public-api/users")
    Call<GetMultiUserResponse> getUserByName(@Header("Authorization") String authorizationHeader,
                                             @Query("name") String userName);

    @GET("public-api/users")
    Call<GetMultiUserResponse> getAllUsers(@Header("Authorization") String authorizationHeader);
>>>>>>> raptis
}

