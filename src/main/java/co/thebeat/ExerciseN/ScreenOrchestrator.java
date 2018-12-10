package co.thebeat.ExerciseN;

public class ScreenOrchestrator {

    public static final int EXIT = -1;

    public static final int INITIAL_SCREEN = 0;

    public static final int DAYS_SCREEN = 1;

    public static final int TIMES_SCREEN = 2;

    public static final int LESSON_SCREEN = 3;

    private static int currentScreen = 0;

    private static InitialScreen initialScreen = new InitialScreen();

    private  static DaysScreen daysScreen = new DaysScreen();

    private static TimesScreen timesScreen = new TimesScreen();

    private static LessonScreen lessonScreen = new LessonScreen();

    public static void start() {

        while(currentScreen != EXIT) {

            switch (currentScreen) {

                case INITIAL_SCREEN: {
                    executeInitialScreen();
                    break;
                }
                case DAYS_SCREEN: {
                    executeDaysScreen();
                    break;
                }
                case TIMES_SCREEN: {
                    executeTimesScreen();
                    break;
                }
                case LESSON_SCREEN: {
                    executeLessonScreen();
                    break;
                }
            }
        }

    }

    public static void setCurrentScreen(int screen) {
        currentScreen = screen;
    }

    public static int getCurrentScreen() {
        return currentScreen;
    }

    private static void executeInitialScreen() {
        int userSelection = initialScreen.showOptionsAndGetUserInput();
        initialScreen.processSelectedOption(userSelection);
    }

    private static void executeDaysScreen() {
        int userSelectedOption = daysScreen.showOptionsAndGetUserInput();
        daysScreen.processSelectedOption(userSelectedOption);
    }

    private static void executeTimesScreen() {
        int userSelectedOption = timesScreen.showOptionsAndGetUserInput();
        timesScreen.processSelectedOption(userSelectedOption);
    }

    private static void executeLessonScreen() {
        lessonScreen.setSelectedDay(daysScreen.getDaySelected());
        lessonScreen.setSelectedTime(timesScreen.getSelectedTime());
        String lesson = lessonScreen.showOptionsAndGetUserInput();
        lessonScreen.processLesson(lesson);
    }
}
