package co.thebeat.ExerciseN;

import java.util.Scanner;

public class LessonScreen {

    private int selectedDay;

    private int selectedTime;

    public String showOptionsAndGetUserInput() {

        showUserText();
        String userLesson = getUserInput();
        return userLesson;
    }

    public void processLesson(String lesson) {
        WeeklySchedule.updateDayAndTimeWithALesson(selectedDay,selectedTime,lesson);
        System.out.println("Your schedule has been updated!");
        ScreenOrchestrator.setCurrentScreen(2);
    }

    public void setSelectedDay(int selectedDay) {
        this.selectedDay = selectedDay;
    }

    public void setSelectedTime(int selectedTime) {
        this.selectedTime = selectedTime;
    }

    private void showUserText() {
        String day = WeeklySchedule.convertOptionToDayText(this.selectedDay);
        String time = WeeklySchedule.convertOptionToTimeText(this.selectedTime);
        System.out.println("Please give the lesson name for "+day+" - "+time+":");
    }

    private String getUserInput() {

        Scanner consoleInput = new Scanner(System.in);
        System.out.print("Input: ");
        String userWrittenText = consoleInput.next();

        return userWrittenText;
    }
}
