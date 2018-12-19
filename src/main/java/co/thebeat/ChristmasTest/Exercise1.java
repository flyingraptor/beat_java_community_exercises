package co.thebeat.ChristmasTest;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        System.out.println( "Please input a text in order to show my skills in Java and reverse its letters" );
        Scanner in = new Scanner( System.in );
        char[] letters = in.nextLine().toCharArray();

        int textSize = letters.length - 1;

        for (int i = textSize; i >= 0; i--) {

            System.out.print( letters[i] );

        }
    }
}

