package co.thebeat.ChristamsTest.Ex1;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){

        System.out.println("give text");
        Scanner input = new Scanner(System.in);
        char[] text = input.nextLine().toCharArray();

        Exercise1 o = new Exercise1();
        o.printReversed(text);

    }

    public String printReversed(char[] text){

        String textRevered = "";

        for(int i=text.length-1; i>=0; i--){

            textRevered+=text[i];
            System.out.print(text[i]);

        }

        return textRevered;
    }



}
