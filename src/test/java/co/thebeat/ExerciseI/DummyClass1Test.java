package co.thebeat.ExerciseI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


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

    }

    @Test
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

    }

    @Test
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
}
