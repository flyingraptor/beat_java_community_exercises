package ExerciseH;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyClass1Test {


    @Test
    public void checkHowManyNumbersAreEqualZeroEquals()      {

        DummyClass1 obj = new DummyClass1();
        int num = obj.checkHowManyNumbersAreEqual(2,4,8);
        assertEquals(0,num);

    }

    @Test
    public void checkHowManyNumbersAreEqualTwoEquals()      {

        DummyClass1 obj = new DummyClass1();
        int num = obj.checkHowManyNumbersAreEqual(4,4,8);
        assertEquals(1,num);

    }

    @Test
    public void checkHowManyNumbersAreEqualThreeEquals()      {

        DummyClass1 obj = new DummyClass1();
        int num = obj.checkHowManyNumbersAreEqual(3,3,3);
        assertEquals(3,num);

    }

    @Test
    public void checkHowManyNumbersAreEqualZeroThreeEquals()      {

        DummyClass1 obj = new DummyClass1();
        int num = obj.checkHowManyNumbersAreEqual(0,0,0);
        assertEquals(3, num);

    }

    @Test
    public void checkHowManyNumbersAreEqualNegativeTwoEquals()      {

        DummyClass1 obj = new DummyClass1();
        int num = obj.checkHowManyNumbersAreEqual(-3,3,3);
        assertEquals(1, num);

    }

    @Test
    public void countEvenNumbersFiveEvenNumbers() {

        int[] numberList = {0,2,4,8,10};
        DummyClass1 obj = new DummyClass1();
        int num = obj.countEvenNumbers(numberList);
        assertEquals(5, num);

    }

    @Test
    public void countEvenNumbersZeroEvenNumbers() {

        int[] numberList = {5,13,67,91,1};
        DummyClass1 obj = new DummyClass1();
        int num = obj.countEvenNumbers(numberList);
        assertEquals(0, num);

    }

    @Test
    public void countEvenNumbersThreeEvenNumbers() {

        int[] numberList = {9,2,5,8,10};
        DummyClass1 obj = new DummyClass1();
        int num = obj.countEvenNumbers(numberList);
        assertEquals(3, num);

    }

    @Test
    public void countEvenNumbersTwoEvenOneNegativeNumbers() {

        int[] numberList = {9,-2,5,8,11};
        DummyClass1 obj = new DummyClass1();
        int num = obj.countEvenNumbers(numberList);
        assertEquals(2, num);

    }

    @Test
    public void countEvenNumbersZeroEvenAllOddNegativeNumbers() {

        int[] numberList = {-3,-7,-5,-9,-11};
        DummyClass1 obj = new DummyClass1();
        int num = obj.countEvenNumbers(numberList);
        assertEquals(0, num);

    }

    @Test
    public void countEvenNumbersFiveEvenAllNegativeNumbers() {

        int[] numberList = {-2,-8,-8,-10,-12};
        DummyClass1 obj = new DummyClass1();
        int num = obj.countEvenNumbers(numberList);
        assertEquals(5, num);

    }

    @Test
    public void countEvenNumbersFiveEvenAllZeroNumbers() {

        int[] numberList = {0,0,0,0,0};
        DummyClass1 obj = new DummyClass1();
        int num = obj.countEvenNumbers(numberList);
        assertEquals(5, num);

    }


}