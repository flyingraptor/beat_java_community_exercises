package co.thebeat.ExerciseQ.AlbumTests;


import co.thebeat.ExerciseQ.AlbumTests.PutAlbumresponseMetadata;
import co.thebeat.ExerciseQ.AlbumTests.PutAlbumResponseResult;
import com.google.gson.annotations.SerializedName;

public class PutAlbumResponse {

    @SerializedName("_meta")
    private PutAlbumresponseMetadata metadata;

    @SerializedName("result")
    private PutAlbumResponseResult result;


    public PutAlbumResponseResult getResult() {
        return result;
    }


    public void setResult(PutAlbumResponseResult result) {
        this.result = result;
    }

    public PutAlbumresponseMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(PutAlbumresponseMetadata metadata) {
        this.metadata = metadata;
    }
}
