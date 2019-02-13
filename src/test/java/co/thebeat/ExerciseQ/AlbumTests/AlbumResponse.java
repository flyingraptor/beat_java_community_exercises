package co.thebeat.ExerciseQ.AlbumTests;

import com.google.gson.annotations.SerializedName;

public class AlbumResponse {

    @SerializedName("_meta")
    private AlbumResponseMetadata metadata;

    @SerializedName("result")
    private AlbumResponseResult result;


    public AlbumResponseResult getResult() {
        return result;
    }


    public void setResult(AlbumResponseResult result) {
        this.result = result;
    }

    public AlbumResponseMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(AlbumResponseMetadata metadata) {
        this.metadata = metadata;
    }
}
