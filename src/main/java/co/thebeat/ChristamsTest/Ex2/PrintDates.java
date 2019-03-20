package co.thebeat.ChristamsTest.Ex2;

public class PrintDates {
    private String blank = "   ";
    private static String datesTemplate = "%-1s";

    String[] dates = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};

    public void printDays(int numberDay, int numberOfFirstDay){

        for(int z=0; z <= (numberDay+numberOfFirstDay); z++) {

            if(z<numberOfFirstDay){

                System.out.print(blank);

            } else if (z == 6 || z == 13 || z == 20 || z == 27 || z == 34) {

                System.out.printf(datesTemplate,dates[z-(numberOfFirstDay)]);
                System.out.println("");

            } else {

                System.out.printf(datesTemplate,dates[z-(numberOfFirstDay)] + " ");

            }

        }

        System.out.println("");
        System.out.println("");


    }

}
