package co.thebeat.ChristmasTest;
import co.thebeat.ChristamsTest.Ex1.Exercise1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    @Test
    void printReversedTestText() {

        String test = "Riko Volidompoukitsas in da house!";

        char[] testText = test.toCharArray();
        System.out.println(testText);

        Exercise1 o = new Exercise1();

       String t = o.printReversed(testText);
        assertEquals("!esuoh ad ni sastikuopmodiloV okiR",t);

    }
}