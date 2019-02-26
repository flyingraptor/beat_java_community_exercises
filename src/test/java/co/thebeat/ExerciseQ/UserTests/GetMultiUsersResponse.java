package co.thebeat.ExerciseQ.UserTests;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class GetMultiUsersResponse {

    @SerializedName("_meta")
    private GetMultiUsersResponseMetadata metadata;

    @SerializedName("result")
    private ArrayList<GetMultiUsersResponseResult> result = new ArrayList<>();

    public void setMetadata(GetMultiUsersResponseMetadata metadata) {
        this.metadata = metadata;
    }

    public void setResult(ArrayList<GetMultiUsersResponseResult> result) {
        this.result = result;
    }

    public ArrayList<GetMultiUsersResponseResult> getResult() {
        return result;
    }

    public GetMultiUsersResponseMetadata getMetadata() {
        return metadata;
    }
}
