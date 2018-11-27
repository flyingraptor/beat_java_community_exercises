package co.thebeat.ExerciseK;

import co.thebeat.ExerciseJ.Square;

public class Main {

    public static void main(String[] args) {
        Square[][] chessboard = new Square[8][8];

        //System.out.println((char) 97);

        int row = 0;

        while (row < 8) {
            int column = 0;
            while (column < 8) {
                Square sqr = new Square(String.valueOf((char) (row + 97)), column + 1);
                chessboard[row][column] = sqr;
                column++;
            }
            row++;
        }


        row = 0;

        while (row < 8) {
            int column = 0;
            while (column < 8) {
                System.out.print(chessboard[row][column].getRow() + chessboard[row][column].getColumn() + " ");
                column++;
            }
            System.out.println();
            row++;
        }




    }
}





