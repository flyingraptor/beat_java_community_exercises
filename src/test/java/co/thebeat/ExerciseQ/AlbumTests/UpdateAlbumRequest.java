package co.thebeat.ExerciseQ.AlbumTests;

import com.google.gson.annotations.SerializedName;

public class UpdateAlbumRequest {

    @SerializedName("user_id")
    private int userId;

    @SerializedName("title")
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
