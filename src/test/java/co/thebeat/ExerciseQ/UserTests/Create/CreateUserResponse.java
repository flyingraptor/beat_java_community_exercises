package co.thebeat.ExerciseQ.UserTests.Create;

import com.google.gson.annotations.SerializedName;

public class CreateUserResponse {

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
