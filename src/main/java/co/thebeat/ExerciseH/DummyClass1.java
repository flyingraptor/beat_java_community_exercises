package co.thebeat.ExerciseH;

<<<<<<< HEAD

public class DummyClass1 {

    //1. Test the following method writing unit tests:
    public int checkHowManyNumbersAreEqual(int x, int y, int z) {
        if (x == y && x == z) {
            return 3;
        } else if ((x == y) || (x == z) || (z == y)) {
            return 1;
        } else {
=======
public class DummyClass1 {

    public int checkHowManyNumbersAreEqual(int x, int y, int z) {
        if (x == y && x == z) {
            return 3;
        }
        else if ((x == y) || (x == z) || (z == y)) {
            return 1;
        }
        else {
>>>>>>> dd160242588158cd183a6f739b5218c4cbe5f6c5
            return 0;
        }
    }

<<<<<<< HEAD
    // 2. Test the following method writing unit tests:
    public int countEvenNumbers(int[] array_nums) {
        int ctr = 0;
        for (int i = 0; i < array_nums.length; i++) {
            if (array_nums[i] % 2 == 0) {
=======
    public int countEvenNumbers(int[] array_nums) {
        int ctr = 0;
        for(int i = 0; i < array_nums.length; i++) {
            if(array_nums[i] % 2 == 0) {
>>>>>>> dd160242588158cd183a6f739b5218c4cbe5f6c5
                ctr++;
            }
        }
        return ctr;
    }
<<<<<<< HEAD

}
=======
} 
>>>>>>> dd160242588158cd183a6f739b5218c4cbe5f6c5
