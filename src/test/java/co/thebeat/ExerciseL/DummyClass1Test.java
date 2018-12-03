package co.thebeat.ExerciseL;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class DummyClass1Test {

    @Test
    void testDivideWithZeroDivider() {
        DummyClass1 dm1 = new DummyClass1();
        try {
            dm1.divide(2, 0);
        } catch (ZeroDividerArgumentException ex) {
            assertTrue(true);
            return;
        } catch (BothArgumentsZeroException e) {
        }
        assertTrue(false);
    }

    @Test
    void divide2() {

        DummyClass1 dm1 = new DummyClass1();
        try {
            dm1.divide2(0, 1);
        } catch (MyRuntimeException ex) {
            assertTrue(true);
            return;
        }
        assertTrue(false);
    }
}