package co.thebeat.ExerciseQ.AlbumTests.Responses.Read;

import co.thebeat.ExerciseQ.AlbumTests.Responses.Create.CreateAlbumResponseMetadata;
import co.thebeat.ExerciseQ.AlbumTests.Responses.Create.CreateAlbumResponseResult;
import com.google.gson.annotations.SerializedName;

public class GetSingleAlbumResponse {

    @SerializedName("_meta")
    private CreateAlbumResponseMetadata metadata;

    @SerializedName("result")
    private CreateAlbumResponseResult result;


    public CreateAlbumResponseResult getResult() {
        return result;
    }


    public void setResult(CreateAlbumResponseResult result) {
        this.result = result;
    }

    public CreateAlbumResponseMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(CreateAlbumResponseMetadata metadata) {
        this.metadata = metadata;
    }
}
