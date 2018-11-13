package com.thebeat.co.ExerciseG;

public class DummyClass2 {

    public Integer sumElementsOfArray(Integer[] array) {
        int sum = 0;

        for(int i=0; i<array.length; i++) {
            sum=sum+array[i];
        }

        return sum;
    }
}
