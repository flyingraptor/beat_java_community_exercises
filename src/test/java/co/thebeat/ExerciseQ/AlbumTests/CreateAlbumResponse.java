package co.thebeat.ExerciseQ.AlbumTests;

import com.google.gson.annotations.SerializedName;

public class CreateAlbumResponse {

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
