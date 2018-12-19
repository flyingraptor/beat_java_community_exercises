package co.thebeat.ChristmasTest;

public class Exercise2 {

    public static void main(String[] args) {


        System.out.println( "2019 Calendar" );
        System.out.println( "Happy New Year" );


        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};


        for (int i = 0; i < months.length; i++) {

            System.out.print( "\n " + months[i] + "\n" );

            String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday",};
            for (int w = 0; w < weekDays.length; w++) {
                System.out.print( " " + weekDays[w] );
            }
            if (months[i].equals( "January" ) || months[i].equals( "March" ) || months[i].equals( "May" ) || months[i].equals( "July" ) || months[i].equals( "August" ) || months[i].equals( "October" ) || months[i].equals( "December" )) {

                for (int j = 1; j <= 31; j++) {

                    System.out.print( " " + j );

                }
            }
            if (months[i].equals( "April" ) || months[i].equals( "June" ) || months[i].equals( "September" ) || months[i].equals( "November" )) {

                for (int j = 1; j <= 30; j++) {

                    System.out.print( " " + j );
                }
            }
            if (months[i].equals( "February" )) {
                for (int j = 1; j <= 28; j++) {

                    System.out.print( " " + j );
                }
            }
        }
    }
}
