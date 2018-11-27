package co.thebeat.ExerciseJ;

public class Main {

    public static void main(String[] args) {

        Square[][] chessboard = new Square[8][8];

        for(int row = 0; row < 8; row++) {

            for(int column =0; column <8; column++) {

            Square sqr = new Square(String.valueOf((char)(row+97)), column +1);
            chessboard[row][column] = sqr;

            }

        }


        for(int row =0; row <8; row++) {

            for(int column =0; column < 8; column++) {

                System.out.print(chessboard[row][column].getRow() + chessboard[row][column].getColumn() + " ");

            }

            System.out.println();
        }

    }

}


