package co.thebeat.ExcerciseO;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {

        String[] names = {"Nikos", "Galateia", "Marina", "Antonis", "Karaman", "Constantako", "Electra","Name", "Name2"};

//names[10] = "Haris"; Doesnt WORK!
// ftiaxnw loopa gia na dw pou kathete o KAraman. Antikathistate meta apo to .indexOf pou vepoue pio meta
        for (int i=0 ; i<names.length ; i++) {
            if (names[i].equals("Karaman")) {
                System.out.println(i+1);
            }

        }
        System.out.println();
        System.out.println();

        List<String> nameList = new ArrayList<>();

        for (int i=0; i<names.length; i++) {
            nameList.add(names[i]);
        }

        nameList.add("Harris");

        for (String theNameElement : nameList) {
            System.out.println(theNameElement);
        }

    }

}
