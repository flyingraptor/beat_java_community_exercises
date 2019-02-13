package co.thebeat.ExerciseJ;

public class MainJ {

    public static void main(String[] args) {

        Square[][] chessboard = new Square[8][8];

        for (int row = 0; row < 8; row++) {

            for (int column = 0; column < 8; column++) {
                Square sqr = new Square(String.valueOf((char)(row + 97)), column + 1);
                chessboard[row][column] = sqr;
            }
        }

        for (int row = 0; row < 8; row++) {

            for(int column = 0; column < 8; column++) {

                System.out.print(chessboard[row][column].getRow() + chessboard[row][column].getColumn() + " ");
            }
            System.out.println();
        }


        String space = " ";
        String stars = "*";

        int x = 6;
        int y = 1;

        for (int i = 0; i < 7; i++) {


            for (int z = 0; z < x; z++) {
                System.out.print(space);
            }

            for (int z = 0; z < y; z++) {
                System.out.print(stars);

            }

            for (int z = 0; z < x; z++) {
                System.out.print(space);
            }

            x = x - 1;
            y = y + 2;

            System.out.println();
        }

        x = 1;
        y = 11;

        for (int i = 0; i < 7; i++) {


            for (int z = 0; z < x; z++) {
                System.out.print(space);
            }

            for (int z = 0; z < y; z++) {
                System.out.print(stars);

            }

            for (int z = 0; z < x; z++) {
                System.out.print(space);
            }

            x = x + 1;
            y = y - 2;

            System.out.println();
        }

    }
}