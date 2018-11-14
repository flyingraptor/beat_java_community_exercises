package co.thebeat.ExerciseH;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyClass1Test {

    @Test
    void checkHowManyNumbersAreEqualResult1() {

        DummyClass1 dc1 = new DummyClass1();
        int equals = dc1.checkHowManyNumbersAreEqual(3,3,4);
        assertEquals(1,equals);

    }

    @Test
    void checkHowManyNumbersAreEqualResult3() {

        DummyClass1 dc1 = new DummyClass1();
        int equals = dc1.checkHowManyNumbersAreEqual(3,3,3);
        assertEquals(3,equals);

    }

    @Test
    void checkHowManyNumbersAreEqualResultNone() {

        DummyClass1 dc1 = new DummyClass1();
        int equals = dc1.checkHowManyNumbersAreEqual(3,4,5);
        assertEquals(0,equals);

    }
    @Test
    void checkHowManyNumbersAreEqualWithNegativeNumber() {

        DummyClass1 dc1 = new DummyClass1();
        int equals = dc1.checkHowManyNumbersAreEqual(3,-3,5);
        assertEquals(0,equals);

    }

    @Test
    void countEvenNumbers() {

        int[] array_nums = {2,4,7,8,9};

        DummyClass1 dc1 = new DummyClass1();
        int evens = dc1.countEvenNumbers(array_nums);
        assertEquals(3, evens);
    }

    @Test
    void countEvenNumbersNone() {

        int[] array_nums = {1,3,7,9};

        DummyClass1 dc1 = new DummyClass1();
        int evens = dc1.countEvenNumbers(array_nums);
        assertEquals(0,evens);
    }

    @Test
    void countEvenNumbersAll() {

        int[] array_nums = {2,4,6,8,10};

        DummyClass1 dc1 = new DummyClass1();
        int evens = dc1.countEvenNumbers(array_nums);
        assertEquals(5,evens);
    }

    @Test
    void countEvenNumbersNegative() {

        int[] array_nums = {-2,-4,-6,8,10};

        DummyClass1 dc1 = new DummyClass1();
        int evens = dc1.countEvenNumbers(array_nums);
        assertEquals(5,evens);
    }
}