package co.thebeat.ExerciseH;

public class DummyClass1 {

    public int checkHowManyNumbersAreEqual(int x, int y, int z) {
        if (x == y && x == z) {
            return 3;
        }
        else if ((x == y) || (x == z) || (z == y)) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public int countEvenNumbers(int[] array_nums) {
        int ctr = 0;
        for(int i = 0; i < array_nums.length; i++) {
            if(array_nums[i] % 2 == 0) {
                ctr++;
            }
        }
        return ctr;
    }
} 
