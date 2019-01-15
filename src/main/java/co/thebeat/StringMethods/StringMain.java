package co.thebeat.StringMethods;

import java.util.Scanner;

public class StringMain {


    public static void main(String[] args) {

        //A. COPYOF Character array with data, an array of chars https://www.tutorialspoint.com/java/java_characters.htm
        char[] Str1 = {'D', 'A', 'M', 'N', '.'};

        // Create a String containig the contents of Str1
        // starting at index 1 for length 2.
        String Str2 = "";
        Str2 = Str2.copyValueOf(Str1);
        System.out.println("God " + Str2);

        //B. Compare strings with contentEquals and ==
        String str1 = "DAMN.", str2 = "damn.";
        CharSequence cs = "DAMN.";
        System.out.println(str1.equals(cs));
        System.out.println(str2.equals(cs));
        System.out.println("Are " + str1 + " and " + str2 + " the same?: " + ((str1 == str2)));
        System.out.println("Are " + str1 + " and " + str2 + " the same?: " + ((str1 == cs)));
        System.out.println("Comparing " + str1 + " and " + cs + ": " + str1.contentEquals(cs));
        System.out.println("Comparing " + str2 + " and " + cs + ": " + str2.contentEquals(cs));


        //C. == vs equals and equalsIgnoreCase https://www.baeldung.com/java-compare-strings

        String a = "hello";
        String b = new String("hello");

        String c = "HELLO";


        System.out.println(("A == B? : " + ((a == b)))); // => true?
        System.out.println(("A == C? : " + ((a == c)))); // => true?


        System.out.println("A equals B? : " + (a.equals(b))); // => true?
        System.out.println("A equals C? : " + (a.equals(c))); // => true?
        System.out.println("A equals C ignoring Case? : " + (a.equalsIgnoreCase(c))); // => true?


        System.out.println(a.compareTo(b)); // => 0
        System.out.println(a.compareTo(c)); // => 0

        //D. Trim
        String text = "  The games over, Feds took your Range Rover   ";
        String trimmed = text.trim();

        System.out.println(trimmed);

        //clear spaces from input

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter phrase with whitespaces: ");

        String inputString = sc.nextLine();

        String stringWithoutSpaces = inputString.trim();

        System.out.println("Phrase with whitespaces: " + inputString);

        System.out.println("Phrase without whitespaces: " + stringWithoutSpaces);


    }
}

