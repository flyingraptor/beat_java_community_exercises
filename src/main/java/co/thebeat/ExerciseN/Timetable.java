package co.thebeat.ExerciseN;

import java.util.Arrays;

public class Timetable {

    public String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    public String[] time = {"9:00", "10:00", "11:00", "12:00", "13:00"};

    public String[][] slots = new String[5][5];

    public void setTimetableSlot(int day, int time, String lesson) {
        slots[day - 1][time - 1] = lesson;
    }

    public void printDaysScreen() {

        System.out.println("Please select a day to Add/Update the schedule");

        int z = 1;
        for (int i = 0; i < 5; i++) {

            String dayNumber = z + ". " + days[i];
            System.out.println(dayNumber);
            z++;
        }

        System.out.println("6. Back");
    }

    public void printTimesScreen() {

        System.out.println("Please select a time to Add/Update a lesson");
        int z = 1;
        for (int i = 0; i < 5; i++) {

            String timeNumber = z + ". " + time[i];
            System.out.println(timeNumber);
            z++;
        }

        System.out.println("6. Back");
    }

    public void printTimetable() {

        System.out.println("----- Weekly Lessons Schedule -----");
        System.out.print("\t\t");

        for (int i = 0; i < days.length; i++) {

            System.out.print("\t\t" + days[i]);
        }
        System.out.println();

        for (int z = 0; z < time.length; z++) {
            System.out.print(time[z]);

            for (int j = 0; j < days.length; j++) {

                if (slots[j][z] == null) {
                    slots[j][z] = "\t\t";
                }
                System.out.print("\t\t" + slots[j][z]);
            }
            System.out.println();
        }
    }
}








