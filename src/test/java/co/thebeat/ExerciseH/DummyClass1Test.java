package co.thebeat.ExerciseH;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyClass1Test {

    @Test
    void checkHowManyNumbersAreEqual_AllNumbersEqual() {

        DummyClass1 dm3 = new DummyClass1();
        int expected3 = 3;
        //case1: x,y >0
        assertEquals(expected3, dm3.checkHowManyNumbersAreEqual(4, 4, 4));
        //case2 x,y = 0
        assertEquals(expected3, dm3.checkHowManyNumbersAreEqual(0, 0, 0));
        //case3 x,y <0
        assertEquals(expected3, dm3.checkHowManyNumbersAreEqual(-1, -1, -1));
    }

    @Test
    void checkHowManyNumbersAreEqual_SomeNumbersEqual() {

        DummyClass1 dm1 = new DummyClass1();
        int expected1 = 1;

        //case1 x,y,z >0 where z = y
        assertEquals(expected1, dm1.checkHowManyNumbersAreEqual(1, 1, 20));

        //case2 x,y,z>= 0 where x,y = 0
        assertEquals(expected1, dm1.checkHowManyNumbersAreEqual(0, 0, 1));

        //case3 x,y,z <= 0 where z < 0
        assertEquals(expected1, dm1.checkHowManyNumbersAreEqual(0, 0, -5));
    }

    @Test
    void checkHowManyNumbersAreEqual_NoNumbersEqual() {

        DummyClass1 dm0 = new DummyClass1();
        int expected0 = 0;
        //case1 x,y,z > 0
        assertEquals(expected0, dm0.checkHowManyNumbersAreEqual(1, 2, 3));
        //case2 x <0 and y,z >0
        assertEquals(expected0, dm0.checkHowManyNumbersAreEqual(-1, 0, 1));

    }

    @Test
    void countEvenNumbers_NegativeNumbers() {

        DummyClass1 dm = new DummyClass1();

        //case1 Two even numbers
        int[] array1 = {-2,-4,35,13};
        int expected1 = dm.countEvenNumbers(array1);
        assertEquals(2,expected1);

        //case2 One even number
        int[] array2 = {-2,-1,-35,-99};
        int expected2 = dm.countEvenNumbers(array2);
        assertEquals(1,expected2);

        //case3 One even number(0)
        int[] array3 = {0,-1,-11,-111};
        int expected3 = dm.countEvenNumbers(array3);
        assertEquals(1,expected3);

        //case4 Two even numbers(0)
        int[] array4 = {0,-2,-5,-9};
        int expected4 = dm.countEvenNumbers(array4);
        assertEquals(2,expected4);

    }

    @Test
    void countEvenNumbers_PositiveNumbers() {

        DummyClass1 dm = new DummyClass1();

        //case1 Two even numbers
        int[] array1 = {2,4,199999,39594059,978581};
        int expected1 = dm.countEvenNumbers(array1);
        assertEquals(2,expected1);

        //case2 One even number
        int[] array2 = {2,5,19999,39594059,97};
        int expected2 = dm.countEvenNumbers(array2);
        assertEquals(1,expected2);

        //case3 One even number(0)
        int[] array3 = {0,0,0,0,0};
        int expected3 = dm.countEvenNumbers(array3);
        assertEquals(5,expected3);

    }
}