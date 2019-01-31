package co.thebeat.xmasTest;

import java.util.Scanner;

public class Main {


    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input a string:");

        char[] letters = in.nextLine().toCharArray();

        for (int i = letters.length - 1; i >= 0; i--) {

            System.out.print(letters[i]);



        System.out.println();
        Calendar calendar = new Calendar();

        calendar.printMonth();


    }

}}
