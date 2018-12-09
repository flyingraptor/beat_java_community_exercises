package co.thebeat.ExerciseI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyClass1Test {

    @Test
    void testSplitStringAt2Parts() {

        DummyClass1 dc1 = new DummyClass1();
        String[] expectedParts = {"abcd","efgh"};

        String[] actualParts = dc1.splitString("abcdefgh", 2);

        assertArrayEquals(expectedParts, actualParts);

    }

    @Test
    void testSplitStringAt4Parts() {

        DummyClass1 dc1 = new DummyClass1();
        String[] expectedParts = {"abcd","efgh","ijkl","mnop"};

        String[] actualParts = dc1.splitString("abcdefghijklmnop", 4);

        assertArrayEquals(expectedParts, actualParts);

    }

    @Test
    void testSplitStringAt0Parts() {

        DummyClass1 dc1 = new DummyClass1();
        String[] expectedParts = {"abcd"};

        String[] actualParts = dc1.splitString("abcd", 0);

        assertArrayEquals(expectedParts, actualParts);
    }

    @Test
    void testSplitStringNotEvenNumberOfLetters() {

        DummyClass1 dc1 = new DummyClass1();

        String[] expectedParts = {"abcde"};

        String[] actualParts = dc1.splitString("abcde", 2);

        assertArrayEquals(expectedParts, actualParts);
    }

    @Test
    void testSplitStringNotEvenNumberOfLettersAndZeroParts() {

        DummyClass1 dc1 = new DummyClass1();

        String[] expectedParts = {"abcde"};

        String[] actualParts = dc1.splitString("abcde", 0);

        assertArrayEquals(expectedParts, actualParts);
    }

    @Test
    void testSplitStringNegativeNumOfParts() {

        DummyClass1 dc1 = new DummyClass1();

        String[] expectedParts = {"abcd"};

        String[] actualParts = dc1.splitString("abcd", -2);

        assertArrayEquals(expectedParts, actualParts);
    }

    @Test
    void testSplitStringWithTextUnableToSplitInSoManyParts() {

        DummyClass1 dc1 = new DummyClass1();

        String[] expectedParts = {"ab"};

        String[] actualParts = dc1.splitString("ab", 4);

        assertArrayEquals(expectedParts, actualParts);
    }

}