package co.thebeat.ExerciseQ.UserTests.Read;

import com.google.gson.annotations.SerializedName;


public class GetSingleUserResponse {

    @SerializedName("_meta")
    private GetSingleUserResponseMetadata metadata;

    @SerializedName("result")
    private GetSingleUserResponseResult result;


    public GetSingleUserResponseResult getResult() {
        return result;
    }


    public void setResult(GetSingleUserResponseResult result) {
        this.result = result;
    }

    public GetSingleUserResponseMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(GetSingleUserResponseMetadata metadata) {
        this.metadata = metadata;
    }
}

