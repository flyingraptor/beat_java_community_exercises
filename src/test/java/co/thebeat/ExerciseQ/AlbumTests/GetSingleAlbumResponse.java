package co.thebeat.ExerciseQ.AlbumTests;

import com.google.gson.annotations.SerializedName;

public class GetSingleAlbumResponse {

        @SerializedName("_meta")
        private GetSingleAlbumResponseMetadata metadata;

        @SerializedName("result")
        private GetSingleAlbumResponseResult result;


        public GetSingleAlbumResponseResult getResult() {
            return result;
        }


        public void setResult(GetSingleAlbumResponseResult result) {
            this.result = result;
        }

        public GetSingleAlbumResponseMetadata getMetadata() {
            return metadata;
        }

        public void setMetadata(GetSingleAlbumResponseMetadata metadata) {
            this.metadata = metadata;
        }
    }


