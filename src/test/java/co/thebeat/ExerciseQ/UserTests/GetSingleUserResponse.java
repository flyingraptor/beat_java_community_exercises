package co.thebeat.ExerciseQ.UserTests;

import com.google.gson.annotations.SerializedName;

public class GetSingleUserResponse {

    @SerializedName("_meta")
    private GetSingleUserResponseMetadata metadata;

    @SerializedName("result")
    private GetSingleUserResponseResult result;

    public void setResult(GetSingleUserResponseResult result) {
        this.result = result;
    }

    public GetSingleUserResponseMetadata getMetadata() {
        return metadata;
    }

    public GetSingleUserResponseResult getResult() {
        return result;
    }

    public void setMetadata(GetSingleUserResponseMetadata metadata) {
        this.metadata = metadata;
    }
}
