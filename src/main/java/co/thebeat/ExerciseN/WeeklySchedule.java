package co.thebeat.ExerciseN;

public class WeeklySchedule {

    private static String scheduleTemplate = "%-12s";

    private static String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday"};

    private static String[] times = {"09:00","10:00","11:00","12:00","13:00"};

    private static String[][] lessonsOnDayAndTime = new String[5][5];

    public static void updateDayAndTimeWithALesson(int dayOption, int timeOption, String lesson) {
        lessonsOnDayAndTime[dayOption-1][timeOption-1] = lesson;
    }

    public static void show() {
        showDays();
        showTimesAndLessons();
    }

    public static String convertOptionToDayText(int option) {
        return days[option-1];
    }

    public static String convertOptionToTimeText(int option) {
        return times[option-1];
    }

    private static void showDays() {

        System.out.printf(scheduleTemplate, " ");

        for (int daysCounter=0; daysCounter<5; daysCounter++) {
            System.out.printf(scheduleTemplate, days[daysCounter]);
        }

        System.out.println();
    }

    private static void showTimesAndLessons() {

        for (int timeCounter=0; timeCounter<5; timeCounter++) {

            System.out.printf(scheduleTemplate, times[timeCounter]);

            for (int daysCounter=0; daysCounter<5; daysCounter++) {

                String lesson = "___________";
                if(lessonsOnDayAndTime[daysCounter][timeCounter] != null) {
                    lesson = lessonsOnDayAndTime[daysCounter][timeCounter];
                }
                System.out.printf(scheduleTemplate, lesson);
            }
            System.out.println();
        }
    }
}
