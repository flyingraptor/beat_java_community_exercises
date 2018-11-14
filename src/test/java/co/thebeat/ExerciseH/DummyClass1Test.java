package co.thebeat.ExerciseH;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyClass1Test {

    @Test
    void checkHowManyNumbersAreEqualResult1() {

        DummyClass1 dc1 = new DummyClass1();
        int areEqual = dc1.checkHowManyNumbersAreEqual(3,3,4);
        assertEquals(areEqual,1);

    }

    @Test
    void checkHowManyNumbersAreEqualResult3() {

        DummyClass1 dc1 = new DummyClass1();
        int areEqual = dc1.checkHowManyNumbersAreEqual(3,3,3);
        assertEquals(areEqual,3);

    }

    @Test
    void checkHowManyNumbersAreEqualResultNone() {

        DummyClass1 dc1 = new DummyClass1();
        int areEqual = dc1.checkHowManyNumbersAreEqual(3,4,5);
        assertEquals(areEqual,0);

    }
    @Test
    void checkHowManyNumbersAreEqualWithNegativeNumber() {

        DummyClass1 dc1 = new DummyClass1();
        int areEqual = dc1.checkHowManyNumbersAreEqual(3,-3,5);
        assertEquals(areEqual,0);

    }

    @Test
    void countEvenNumbers() {

        int[] array_nums = {2,4,7,8,9};

        DummyClass1 dc1 = new DummyClass1();
        int evens = dc1.countEvenNumbers(array_nums);
        assertEquals(evens,3);
    }

    @Test
    void countEvenNumbersNone() {

        int[] array_nums = {1,3,7,9};

        DummyClass1 dc1 = new DummyClass1();
        int evens = dc1.countEvenNumbers(array_nums);
        assertEquals(evens,0);
    }

    @Test
    void countEvenNumbersAll() {

        int[] array_nums = {2,4,6,8,10};

        DummyClass1 dc1 = new DummyClass1();
        int evens = dc1.countEvenNumbers(array_nums);
        assertEquals(evens,5);
    }

    @Test
    void countEvenNumbersNegative() {

        int[] array_nums = {-2,-4,-6,8,10};

        DummyClass1 dc1 = new DummyClass1();
        int evens = dc1.countEvenNumbers(array_nums);
        assertEquals(evens,5);
    }
}