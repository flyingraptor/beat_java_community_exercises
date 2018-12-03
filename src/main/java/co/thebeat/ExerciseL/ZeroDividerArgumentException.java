package co.thebeat.ExerciseL;

public class ZeroDividerArgumentException extends Exception {

    private String errorMessage;

    public ZeroDividerArgumentException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
