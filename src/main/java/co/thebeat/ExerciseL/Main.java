package co.thebeat.ExerciseL;

public class Main {
    public static void main(String[] args) {

        int maxStars = 13;
        int offset;
        String stars = "*";
        String space;

        for (int i = 1; i <= maxStars; i = i + 2) {

            space = "";
            offset = (maxStars - i) / 2;

            for(int x = 0; x < offset; x++){

                space = space + " ";

            }

            System.out.print(space);

            for(int y = i; y > 0; y--){

                System.out.print(stars);

                }

            System.out.println("");

        }

        maxStars = maxStars - 2;

        for (int i = maxStars; i > 0; i = i -2) {

            space = " ";
            offset = (maxStars - i) /2;

            for(int x = 0; x < offset; x++){

                space = space + " ";

            }

            System.out.print(space);

            for (int y = i; y > 0; y--) {

                System.out.print(stars);

            }

            System.out.println("");

        }

    }

}
