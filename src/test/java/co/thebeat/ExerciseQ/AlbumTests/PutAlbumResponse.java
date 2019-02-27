package co.thebeat.ExerciseQ.AlbumTests;

import co.thebeat.ExerciseQ.AlbumTests.PutAlbumResponseMetadata;
import co.thebeat.ExerciseQ.AlbumTests.PutAlbumResponseResult;
import com.google.gson.annotations.SerializedName;

public class PutAlbumResponse {

    @SerializedName("_meta")
    private PutAlbumResponseMetadata metadata;

    @SerializedName("result")
    private PutAlbumResponseResult result;


    public PutAlbumResponseResult getResult() {
        return result;
    }


    public void setResult(PutAlbumResponseResult result) {
        this.result = result;
    }

    public PutAlbumResponseMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(PutAlbumResponseMetadata metadata) {
        this.metadata = metadata;
    }
}