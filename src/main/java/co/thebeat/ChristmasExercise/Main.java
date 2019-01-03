package co.thebeat.ChristmasExercise;


public class Main {

    private static String calendarFormat = "%-4s";

    private static String[] months = {"January", "February", "March",
            "April", "May", "June", "July", "August", "September", "October",
            "November", "December"};

    private static String[] days = {"S","M","T","W","T","F","S"};

    private static int year = 2019;

    private final static int AUGUST = 8;

    private static Integer[] oddMonthDays = new Integer[31];

    private static Integer[] evenMonthDays = new Integer[30];

    private static Integer[] februaryDays = new Integer[28];

    public static void main(String[] args) {

        initializeDays();

        int spaceToLeaveInNextMonth = 2; //January 2019 start with two spaces for Sunday and Monday

        for (int monthCounter = 1; monthCounter <= 12; monthCounter++) {

            printMonthNameAndDaysOfWeek(monthCounter);

            int printedCharactersCounter = 0;
            printedCharactersCounter = printInitialSpacesInEachMonth(printedCharactersCounter, spaceToLeaveInNextMonth);

            spaceToLeaveInNextMonth = printCalendarDays(monthCounter, printedCharactersCounter);
            System.out.println();
        }
    }

    private static void printMonthNameAndDaysOfWeek(int monthCounter) {
        System.out.println();
        System.out.println(months[monthCounter - 1] + " " + year);
        for(int i=0; i<7; i++) {
            System.out.printf(calendarFormat, days[i]);
        }
        System.out.println();
    }

    private static void initializeDays() {

        for (int i = 0; i < 31; i++) {
            oddMonthDays[i] = i + 1;
        }

        for (int i = 0; i < 30; i++) {
            evenMonthDays[i] = i + 1;
        }

        for (int i = 0; i < 28; i++) {
            februaryDays[i] = i + 1;
        }
    }

    private static int printInitialSpacesInEachMonth(int printedCharactersCounter, int spaceToLeaveInNextMonth) {

        if(spaceToLeaveInNextMonth == 7) {
            return 0;
        }

        for (int spaceCounter = 0; spaceCounter < spaceToLeaveInNextMonth; spaceCounter++) {
            System.out.printf(calendarFormat," ");
            printedCharactersCounter++;
        }

        return printedCharactersCounter;
    }

    private static int printCalendarDays(int monthCounter, int printedCharactersCounter) {

        if (monthCounter == 2) {
            printedCharactersCounter = printFebruaryMonth(printedCharactersCounter);

        } else if ((monthCounter % 2) == 1) {
            if(monthCounter < AUGUST) {
                printedCharactersCounter = printMonthWith31Days(printedCharactersCounter);
            } else {
                printedCharactersCounter = printMonthWith30Days(printedCharactersCounter);
            }

        } else if ((monthCounter % 2) == 0) {
            if(monthCounter < AUGUST) {
                printedCharactersCounter = printMonthWith30Days(printedCharactersCounter);
            } else {
                printedCharactersCounter = printMonthWith31Days(printedCharactersCounter);
            }
        }

        return printedCharactersCounter;
    }

    private static int printMonthWith30Days(Integer printedCounter) {

        for (int i = 0; i < evenMonthDays.length; i++) {

            if (printedCounter == 7) {
                System.out.println();
                printedCounter = 0;
            }
            printedCounter++;
            System.out.printf(calendarFormat,evenMonthDays[i] + " ");
        }

        return printedCounter;
    }

    private static int printFebruaryMonth(Integer printedCounter) {

        for (int i = 0; i < februaryDays.length; i++) {

            if (printedCounter == 7) {
                System.out.println();
                printedCounter = 0;
            }
            printedCounter++;
            System.out.printf(calendarFormat,februaryDays[i] + " ");
        }

        return printedCounter;
    }

    private static int printMonthWith31Days(Integer printedCounter) {

        for (int i = 0; i < oddMonthDays.length; i++) {

            if (printedCounter == 7) {
                System.out.println();
                printedCounter = 0;
            }
            printedCounter++;
            System.out.printf(calendarFormat,oddMonthDays[i] + " ");

        }

        return printedCounter;
    }
}
