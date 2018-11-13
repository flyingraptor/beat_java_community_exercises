package co.thebeat.ExerciseG;

import java.util.Scanner;

public class DummyClass4 {

    public static void main(String[] args) {

        System.out.println("Please give me a value to check: ");
        Scanner in = new Scanner(System.in);
        Integer element = in.nextInt();
        Integer[] ar1 = {10,3,66,43,22};

        DummyClass4 dc4 = new DummyClass4();
        boolean contained = dc4.checkIfArrayContains(ar1, element);

        if(contained == true) {
            System.out.println("Yes the value is in the array");
        }
    }

    public boolean checkIfArrayContains(Integer[] array,
                                        Integer elementToCheck) {

        boolean contained = false;

        for(int i=0; i<array.length; i++) {

            if(array[i] == elementToCheck) {
                contained = true;
                break;
            }
        }

        return contained;
    }
}
