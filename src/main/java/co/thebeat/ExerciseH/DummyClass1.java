package co.thebeat.ExerciseH;


public class DummyClass1 {

    //1. Test the following method writing unit tests:
    public int checkHowManyNumbersAreEqual(int x, int y, int z) {
        if (x == y && x == z) {
            return 3;
        } else if ((x == y) || (x == z) || (z == y)) {
            return 1;
        } else {
            return 0;
        }
    }

    // 2. Test the following method writing unit tests:
    public int countEvenNumbers(int[] array_nums) {
        int ctr = 0;
        for (int i = 0; i < array_nums.length; i++) {
            if (array_nums[i] % 2 == 0) {
                ctr++;
            }
        }
        return ctr;
    }

}