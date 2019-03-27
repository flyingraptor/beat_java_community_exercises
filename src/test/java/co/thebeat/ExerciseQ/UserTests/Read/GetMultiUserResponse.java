package co.thebeat.ExerciseQ.UserTests.Read;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class GetMultiUserResponse {


    @SerializedName("_meta")
    private GetMultiUserResponseMetadata metadata;

    @SerializedName("result")
    private ArrayList <GetMultiUserResponseResult> result = new ArrayList<>();


    public ArrayList<GetMultiUserResponseResult> getResult() {
        return result;
    }

    public void setResult(ArrayList<GetMultiUserResponseResult> result) {
        this.result = result;
    }

    public GetMultiUserResponseMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(GetMultiUserResponseMetadata metadata) {
        this.metadata = metadata;
    }
}



