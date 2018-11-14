package co.thebeat.ExerciseH;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyClass1Test {

    @Test
    void checkIfAllNumbersAreEquals() {

        DummyClass1 dc1 = new DummyClass1();

        int numOfEquals = dc1.checkHowManyNumbersAreEqual(2, 2, 2);

        assertEquals(3, numOfEquals);
    }

    @Test
    void checkIfTwoNumbersAreEquals() {

        DummyClass1 dc1 = new DummyClass1();

        int numOfEquals = dc1.checkHowManyNumbersAreEqual(3, 3, 5);
        assertEquals(1, numOfEquals);
    }

    @Test
    void checkIfTwoNegativeNumbersAreEquals() {

        DummyClass1 dc1 = new DummyClass1();

        int numOfEquals = dc1.checkHowManyNumbersAreEqual(-5, -10, 10);
        assertEquals(1, numOfEquals);
    }

    @Test
    void checkIfNoneOfTheNumbersAreEquals() {

        DummyClass1 dc1 = new DummyClass1();

        int numOfEquals = dc1.checkHowManyNumbersAreEqual(10, 55, 22);
        assertEquals(0, numOfEquals);
    }


    @Test
    void checkCountEvenNumbersCounter() {

        DummyClass1 dc1 = new DummyClass1();
        int[] array_nums = {12, 25, 35};
        int countEvenNo = dc1.countEvenNumbers(array_nums);
        assertTrue(countEvenNo == 1);

    }

    @Test
    void checkCountEvenNumersCounterNegativeNumbers() {

        DummyClass1 dc1 = new DummyClass1();
        int[] array_nums = {-122, -44, -55};
        int countEvenNo = dc1.countEvenNumbers(array_nums);
        assertTrue(countEvenNo == 2);

    }



}