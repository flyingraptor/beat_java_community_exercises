package co.thebeat.ExerciseQ.UserTests.Read;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class GetFilteredByNameResponse {


    @SerializedName("_meta")
    private GetFilteredByNameResponseMetadata metadata;

    @SerializedName("result")
    private ArrayList <GetFilteredByNameResponseResult> result = new ArrayList<>();


    public ArrayList<GetFilteredByNameResponseResult> getResult() {
        return result;
    }

    public void setResult(ArrayList<GetFilteredByNameResponseResult> result) {
        this.result = result;
    }

    public GetFilteredByNameResponseMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(GetFilteredByNameResponseMetadata metadata) {
        this.metadata = metadata;
    }
}



