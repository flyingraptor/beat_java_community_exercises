package co.thebeat.ExerciseG;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyClass3Test {

    @Test
    void testAverageOfArrayElemets() {

        Integer[] ar1 = {10,3,66,43,22};
        Double expectedAverage = 28.8;

        DummyClass3 dc3 = new DummyClass3();
        Double actualAverage = dc3.averageOfArrayElemets(ar1);

        assertEquals(expectedAverage,actualAverage);
    }
}