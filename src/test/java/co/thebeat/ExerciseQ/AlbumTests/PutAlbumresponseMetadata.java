package co.thebeat.ExerciseQ.AlbumTests;

public class PutAlbumresponseMetadata {

    private boolean success;

    private short code;

    private String message;

    public boolean isSuccess() {
        return success;
    }

    public short getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(short code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
