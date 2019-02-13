package co.thebeat.ExerciseQ.UserTests;

import com.google.gson.annotations.SerializedName;

public class CreateUserResponse {

    //meta
    @SerializedName("_meta")
    private CreateUserResponseMetadata metadata;

    @SerializedName("result")
    private CreateUserResponseResult result;


    public CreateUserResponseResult getResult() {
        return result;
    }


    public void setResult(CreateUserResponseResult result) {
        this.result = result;
    }

    public CreateUserResponseMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(CreateUserResponseMetadata metadata) {
        this.metadata = metadata;
    }

}
