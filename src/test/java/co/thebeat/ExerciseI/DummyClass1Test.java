package co.thebeat.ExerciseI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyClass1Test {

    @Test
    void testSplitStringGalateaThreeParts() {

        DummyClass1 obj = new DummyClass1();

     String[] parts =  obj.splitString("Galatea", 3);

     assertEquals(3, parts.length);

    }

    @Test
    void testSplitStringNullStringOnePart() {

        DummyClass1 obj = new DummyClass1();

        String[] parts =  obj.splitString("", 1);

        assertEquals(1, parts.length);

    }

    @Test
    void testSplitStringGalateaTwoParts() {

        DummyClass1 obj = new DummyClass1();

        String[] parts =  obj.splitString("Galatea", 2);

        assertEquals(2, parts.length);

    }

    @Test
    void testSplitStringGalTwoParts() {

        DummyClass1 obj = new DummyClass1();

        String[] parts =  obj.splitString("Gal", 2);

        assertEquals(32, parts.length);

    }

    @Test
    void testSplitStringGalThreeParts() {

        DummyClass1 obj = new DummyClass1();

        String[] parts =  obj.splitString("Gal", 3);

        assertEquals(3, parts.length);

    }
}