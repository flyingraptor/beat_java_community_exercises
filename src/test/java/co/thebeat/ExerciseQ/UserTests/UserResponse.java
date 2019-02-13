package co.thebeat.ExerciseQ.UserTests;

import com.google.gson.annotations.SerializedName;

public class UserResponse {

    @SerializedName("_meta")
    private UserResponseMetadata metadata;

    @SerializedName("result")
    private UserResponseResult result;


    public UserResponseResult getResult() {
        return result;
    }


    public void setResult(UserResponseResult result) {
        this.result = result;
    }

    public UserResponseMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(UserResponseMetadata metadata) {
        this.metadata = metadata;
    }
}
