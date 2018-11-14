package co.thebeat.ExerciseH;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyClassTest {

    @Test
    public void checkHowManyNumbersAreEqual_NonEquals() {
          DummyClass dummyClass = new DummyClass();

          int result = dummyClass.checkHowManyNumbersAreEqual(1,1,1);

          assertEquals(3,result);
    }

    @Test
    public void countEvenNumbers() {

        }
    }

