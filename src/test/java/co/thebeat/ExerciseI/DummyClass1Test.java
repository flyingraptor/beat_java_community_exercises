package co.thebeat.ExerciseI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

<<<<<<< HEAD

public class DummyClass1Test {

    @Test
    void testSplitStringSixCharText() {

        DummyClass1 dc1 = new DummyClass1();
        String[] splitted = dc1.splitString("Petros", 2);
        String[] actual = {"Pet", "ros"};
        assertArrayEquals(splitted, actual);
    }

    @Test
    void testSplitStringSevenCharText() {

        DummyClass1 dc1 = new DummyClass1();
        String[] splitted = dc1.splitString("Electra",2);
        String[] actual = {"ELectra"};
        assertArrayEquals(splitted,actual);
=======
class DummyClass1Test {

    @Test
    void testSplitStringAt2Parts() {

        DummyClass1 dc1 = new DummyClass1();
        String[] expectedParts = {"abcd","efgh"};

        String[] actualParts = dc1.splitString("abcdefgh", 2);

        assertArrayEquals(expectedParts, actualParts);
>>>>>>> dd160242588158cd183a6f739b5218c4cbe5f6c5

    }

    @Test
<<<<<<< HEAD
    void testSplitStringOneCharText() {

        DummyClass1 dc1 = new DummyClass1();
        String[] splitted = dc1.splitString("a",2);
        String[] actual = {"a"};
        assertArrayEquals(splitted,actual);

    }

    @Test
    void testSplitStringTwoCharText() {

        DummyClass1 dc1 = new DummyClass1();
        String[] splitted = dc1.splitString("ab",2);
        String[] actual = {"a","b"};
        assertArrayEquals(splitted,actual);
=======
    void testSplitStringAt4Parts() {

        DummyClass1 dc1 = new DummyClass1();
        String[] expectedParts = {"abcd","efgh","ijkl","mnop"};

        String[] actualParts = dc1.splitString("abcdefghijklmnop", 4);

        assertArrayEquals(expectedParts, actualParts);
>>>>>>> dd160242588158cd183a6f739b5218c4cbe5f6c5

    }

    @Test
<<<<<<< HEAD
    void testSplitStringSixCharTextThreeParts() {

        DummyClass1 dc1 = new DummyClass1();
        String[] splitted = dc1.splitString("Petros",3);
        String[] actual = {"Pe","tr","os"};
        assertArrayEquals(splitted,actual);

    }

    @Test
    void testSplitStringSixCharTextOnePart() {

        DummyClass1 dc1 = new DummyClass1();
        String[] splitted = dc1.splitString("Petros",1);
        String[] actual = {"Petros"};
        assertArrayEquals(splitted,actual);

    }

    @Test
    void testSplitStringSixCharTextSixParts() {

        DummyClass1 dc1 = new DummyClass1();
        String[] splitted = dc1.splitString("Petros",6);
        String[] actual = {"P","e","t","r","o","s"};
        assertArrayEquals(splitted,actual);

    }

    @Test
    void testSplitStringTwoCharTextThreeParts() {

        DummyClass1 dc1 = new DummyClass1();
        String[] splitted = dc1.splitString("ab",3);
        String[] actual = {"ab"};
        assertArrayEquals(splitted,actual);

    }

    @Test
    void testSplitStringTwoCharZeroParts() {

        DummyClass1 dc1 = new DummyClass1();
        String[] splitted = dc1.splitString("ab",0);
        String[] actual = {"ab"};
        assertArrayEquals(splitted,actual);

    }

    @Test
    void testSplitStringThreeCharSixParts() {

        DummyClass1 dc1 = new DummyClass1();
        String[] splitted = dc1.splitString("abc",6);
        String[] actual = {"abc"};
        assertArrayEquals(splitted,actual);

    }

    @Test
    void testSplitStringBlankChar() {

        DummyClass1 dc1 = new DummyClass1();
        String[] splitted = dc1.splitString("ab c",2);
        String[] actual = {"ab", " c"};
        assertArrayEquals(splitted,actual);
    }

    @Test
    void testSplitStringNegativeParts() {

        DummyClass1 dc1 = new DummyClass1();
        String[] splitted = dc1.splitString("abcd",-2);
        String[] actual = {"abcd"};
        assertArrayEquals(splitted,actual);
    }
}
=======
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
>>>>>>> dd160242588158cd183a6f739b5218c4cbe5f6c5
