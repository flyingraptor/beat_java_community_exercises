package co.thebeat.ExerciseL;

public class Diamond {

    private int maxStars;
    private int offset;
    private String stars;
    private String space;

    public Diamond() {
        this.maxStars = 13;
        this.stars = "*";
    }

    public void printStars() {

        for (int i = 1; i <= maxStars; i = i + 2) {

            space = "";
            offset = (maxStars - i) / 2;

            for (int x = 0; x < offset; x++) {

                space = space + " ";

            }

            System.out.print(space);

            for (int y = i; y > 0; y--) {

                System.out.print(stars);

            }

            System.out.println("");

        }

        for (int i = maxStars - 2; i > 0; i = i - 2) {

            space = " ";
            offset = ((maxStars - 2) - i) / 2;

            for (int x = 0; x < offset; x++) {

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
