package com.thebeat.co.ExerciseG;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyClass1Test {

    @Test
    void testSortAsceding() {

        Integer[] ar1 = {6,4,2,21,45,32,11};
        Integer[] expected = {2,4,6,11,21,32,45};

        DummyClass1 dc1 = new DummyClass1();
        dc1.sortAsceding(ar1);

        assertArrayEquals(expected,ar1);
    }
}