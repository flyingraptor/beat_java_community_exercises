package co.thebeat.xmasTest;

public class Calendar {

    private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private String[] days = {"S", "M", "T", "W", "T", "F", "S", "S"};
    private int[] dates = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};

    public int[][] dayNumbers = new int[7][5];



    public void printMonth() {

        for (int i = 0; i < months.length; i++) {

            System.out.println(months[i] + " 2019");


            for (int z = 0; z < days.length - 1; z++) {
                System.out.print(days[z] + "\t");

            }
            System.out.println();

            printDates();

            System.out.println();
            System.out.println();
        }

    }

    public void printDates() {

        for (int i = 0; i < dates.length; i++) {

            System.out.print(dates[i] + "\t");
            if (i == 6) {
                System.out.println();
            }
            if (i == 13) {
                System.out.println();
            }
            if (i == 20) {
                System.out.println();
            }
            if (i == 27) {
                System.out.println();
            }



            }


        }
        }



