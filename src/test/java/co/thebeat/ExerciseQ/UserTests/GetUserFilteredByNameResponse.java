package co.thebeat.ExerciseQ.UserTests;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class GetUserFilteredByNameResponse {

    @SerializedName("_meta")
    private GetUserFilteredByNameResponseMetadata metadata;

    @SerializedName("result")
    private ArrayList<GetUserFilteredByNameResponseResult> result = new ArrayList<>();


    public ArrayList<GetUserFilteredByNameResponseResult> getResult() {
        return result;
    }

    public void setResult(ArrayList<GetUserFilteredByNameResponseResult> result) {
        this.result = result;
    }

    public GetUserFilteredByNameResponseMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(GetUserFilteredByNameResponseMetadata metadata) {
        this.metadata = metadata;
    }

}
