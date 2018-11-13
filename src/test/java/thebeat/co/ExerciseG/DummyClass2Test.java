package thebeat.co.ExerciseG;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyClass2Test {

    @Test
    void testSumElementsOfArray() {

        Integer[] ar1 = {5,3,4,6,5};
        Integer expectedSum = 23;

        DummyClass2 dc2 = new DummyClass2();
        Integer actualSum = dc2.sumElementsOfArray(ar1);

        assertEquals(expectedSum,actualSum);

    }
}