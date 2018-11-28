package co.thebeat.ExerciseH;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyClass1Test {

<<<<<<< HEAD

    @Test
    void checkHowManyNumbersAreEqualZeroEquals()      {

        DummyClass1 obj = new DummyClass1();
        int num = obj.checkHowManyNumbersAreEqual(2,4,8);
        assertEquals(0,num);

    }

    @Test
    void checkHowManyNumbersAreEqualTwoEquals()      {

        DummyClass1 obj = new DummyClass1();
        int num = obj.checkHowManyNumbersAreEqual(4,4,8);
        assertEquals(1,num);

    }

    @Test
    void checkHowManyNumbersAreEqualThreeEquals()      {

        DummyClass1 obj = new DummyClass1();
        int num = obj.checkHowManyNumbersAreEqual(3,3,3);
        assertEquals(3,num);

    }

    @Test
    void checkHowManyNumbersAreEqualZeroThreeEquals()      {

        DummyClass1 obj = new DummyClass1();
        int num = obj.checkHowManyNumbersAreEqual(0,0,0);
        assertEquals(3, num);

    }

    @Test
    void checkHowManyNumbersAreEqualNegativeTwoEquals()      {

        DummyClass1 obj = new DummyClass1();
        int num = obj.checkHowManyNumbersAreEqual(-3,3,3);
        assertEquals(1, num);

    }

    @Test
    void countEvenNumbersFiveEvenNumbers() {

        int[] numberList = {0,2,4,8,10};
        DummyClass1 obj = new DummyClass1();
        int num = obj.countEvenNumbers(numberList);
        assertEquals(5, num);

    }

    @Test
    void countEvenNumbersZeroEvenNumbers() {

        int[] numberList = {5,13,67,91,1};
        DummyClass1 obj = new DummyClass1();
        int num = obj.countEvenNumbers(numberList);
        assertEquals(0, num);
=======
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
>>>>>>> dd160242588158cd183a6f739b5218c4cbe5f6c5

    }

    @Test
<<<<<<< HEAD
    void countEvenNumbersThreeEvenNumbers() {

        int[] numberList = {9,2,5,8,10};
        DummyClass1 obj = new DummyClass1();
        int num = obj.countEvenNumbers(numberList);
        assertEquals(3, num);

    }

    @Test
    void countEvenNumbersTwoEvenOneNegativeNumbers() {

        int[] numberList = {9,-2,5,8,11};
        DummyClass1 obj = new DummyClass1();
        int num = obj.countEvenNumbers(numberList);
        assertEquals(2, num);

    }

    @Test
    void countEvenNumbersZeroEvenAllOddNegativeNumbers() {

        int[] numberList = {-3,-7,-5,-9,-11};
        DummyClass1 obj = new DummyClass1();
        int num = obj.countEvenNumbers(numberList);
        assertEquals(0, num);

    }

    @Test
    void countEvenNumbersFiveEvenAllNegativeNumbers() {

        int[] numberList = {-2,-8,-8,-10,-12};
        DummyClass1 obj = new DummyClass1();
        int num = obj.countEvenNumbers(numberList);
        assertEquals(5, num);

    }

    @Test
    void countEvenNumbersFiveEvenAllZeroNumbers() {

        int[] numberList = {0,0,0,0,0};
        DummyClass1 obj = new DummyClass1();
        int num = obj.countEvenNumbers(numberList);
        assertEquals(5, num);

    }
=======
    void checkCountEvenNumbersCounterNegativeNumbers() {

        DummyClass1 dc1 = new DummyClass1();
        int[] array_nums = {-122, -44, -55};
        int countEvenNo = dc1.countEvenNumbers(array_nums);
        assertTrue(countEvenNo == 2);

    }


>>>>>>> dd160242588158cd183a6f739b5218c4cbe5f6c5

}