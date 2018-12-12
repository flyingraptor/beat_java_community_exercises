package co.thebeat.ExerciseN;

import java.util.Scanner;

public class SchoolSchedule {

    public static void main(String[] args) {


        String[] row0 = {" ", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] row1 = {"09.00", " ", " ", " ", " ", " "};
        String[] row2 = {"10.00", " ", " ", " ", " ", " "};
        String[] row3 = {"11.00", " ", " ", " ", " ", " "};
        String[] row4 = {"12.00", " ", " ", " ", " ", " "};
        String[] row5 = {"13.00", " ", " ", " ", " ", " "};

        String[][] schedule = {row0, row1, row2, row3, row4, row5};

        for (String[] row : schedule) {

            for (String s : row) {

                System.out.print( "      " + s );

            }

            System.out.println();
        }


        System.out.println( "Please select day to Add/Update the schedule: " );

        for (int i = 1; i <= 5; i++) {
            System.out.println( row0[i] );
        }
        System.out.println( "Back" );
        Scanner in = new Scanner( System.in );
        String selectedDay = in.nextLine();


        System.out.println( "Please select a time to Add/Update a lesson" );

        System.out.println( row0[0] );
        System.out.println( row1[0] );
        System.out.println( row2[0] );
        System.out.println( row3[0] );
        System.out.println( row4[0] );
        System.out.println( row5[0] );

        Scanner in2 = new Scanner( System.in );
        String selectedHour = in2.nextLine();

        System.out.println( "Please give the lesson name for " + selectedDay + " - " + selectedHour + ":" );

        Scanner in3 = new Scanner( System.in );
        String lessonName = in3.nextLine();

        System.out.println( "Your schedule has been updated!" );

    }

}

