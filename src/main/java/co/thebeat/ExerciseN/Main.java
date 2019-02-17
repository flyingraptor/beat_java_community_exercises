package co.thebeat.ExerciseN;

import java.sql.Time;
import java.util.Scanner;

public class Main {

    private static void showInitialScreen() {

        System.out.println("Welcome to Scrum4School");
        System.out.println();

        System.out.println("Please select one of the following options:");

        System.out.println("1. View the weekly lessons schedule");
        System.out.println("2. Add/Update a lesson for a day and time");
        System.out.println("3. Close Program");
    }

    public static void main(String[] args) {

        showInitialScreen();

        Scanner in = new Scanner(System.in);
        System.out.println("Input:");

        int option = in.nextInt();

        Timetable timetable1 = new Timetable();

        while (option != 3) {

            if (option == 2) {

                timetable1.printDaysScreen();
            }

            if (option == 1) {

                timetable1.printTimetable();
                System.out.println();
                showInitialScreen();
            }

            int option2 = in.nextInt();

            while (option2 != 6) {

                timetable1.printTimesScreen();

                int option3 = in.nextInt();

                while (option3 != 6) {

                    System.out.println("Please give the lesson name for " + timetable1.days[option2 - 1] + " - " + timetable1.time[option3 - 1]);

                    String lesson1 = in.next();

                    timetable1.setTimetableSlot(option2, option3, lesson1);

                    System.out.println("Your schedule has been updated!");

                    timetable1.printTimesScreen();
                    option3 = in.nextInt();
                }

                timetable1.printDaysScreen();
                option2 = in.nextInt();
            }

            showInitialScreen();
            option = in.nextInt();

        }
    }
}
