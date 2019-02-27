package co.thebeat.ExerciseQ.AlbumTests.Delete;

import com.google.gson.annotations.SerializedName;

public class DeleteAlbumResponse {

    @SerializedName("_meta")
    private DeleteAlbumResponseMetadata metadata;

    @SerializedName("result")
    private DeleteAlbumResponseResult result;


    public DeleteAlbumResponseResult getResult() {
        return result;
    }


    public void setResult(DeleteAlbumResponseResult result) {
        this.result = result;
    }

    public DeleteAlbumResponseMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(DeleteAlbumResponseMetadata metadata) {
        this.metadata = metadata;
    }
}

