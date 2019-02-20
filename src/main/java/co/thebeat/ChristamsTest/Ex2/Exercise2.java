package co.thebeat.ChristamsTest.Ex2;

public class Exercise2 {
    public static void main(String[] args){

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August","September", "October", "November", "December"};
        String year = "2019";
        String[] days = {"S","M","T","W","T","F","S"};
        String blank = "   ";
        PrintDates mon = new PrintDates();
        String datesTemplate = "%-3s";


        for(int i=0; i<=11; i++){


            System.out.println(months[i] + " " + year);

            for(int y=0; y<=6; y++){

                System.out.printf(datesTemplate,days[y]);

            }

            System.out.println("");

            if (months[i] == "January" || months[i] == "October") {

                mon.printDays(30,2);

            } else if (months[i] == "February") {

                mon.printDays(27,5);

            } else if (months[i] == "March") {

                mon.printDays(30, 5);
            } else if (months[i] == "April") {

                mon.printDays(29,1);
            } else if (months[i] == "May") {

                mon.printDays(30,3);

            } else if (months[i] == "June") {

                mon.printDays(29,6);
            } else if (months[i] == "July") {

                mon.printDays(30,1);
            } else if (months[i] == "August") {

                mon.printDays(30,4);
            } else if (months[i] == "September") {

                mon.printDays(29,0);
            } else if (months[i] == "November") {

                mon.printDays(29,5);
            } else if (months[i] == "December") {

                mon.printDays(30,0);
            }

        }

    }
}