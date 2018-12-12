package co.thebeat.ExerciseN;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class InitialScreenTest {

    @Test
    void showOptionsAndGetUserInput_ViewScheduleSelected() {

        System.setIn(new ByteArrayInputStream("1".getBytes()));

        InitialScreen initialScreen = new InitialScreen();
        int actualSelection = initialScreen.showOptionsAndGetUserInput();

        assertEquals(1,actualSelection);
    }

    @Test
    void showOptionsAndGetUserInput_AddUpdateLessonSelected() {

        System.setIn(new ByteArrayInputStream("2".getBytes()));

        InitialScreen initialScreen = new InitialScreen();
        int actualSelection = initialScreen.showOptionsAndGetUserInput();

        assertEquals(2,actualSelection);
    }

    @Test
    void showOptionsAndGetUserInput_ExitSelected() {

        System.setIn(new ByteArrayInputStream("3".getBytes()));

        InitialScreen initialScreen = new InitialScreen();
        int actualSelection = initialScreen.showOptionsAndGetUserInput();

        assertEquals(3,actualSelection);
    }

    @Test
    void processSelectedOption_showSchedule() {
        InitialScreen initialScreen = new InitialScreen();
        initialScreen.processSelectedOption(1);
        assertEquals(ScreenOrchestrator.INITIAL_SCREEN, ScreenOrchestrator.getCurrentScreen());
    }

    @Test
    void processSelectedOption_showDays() {
        InitialScreen initialScreen = new InitialScreen();
        initialScreen.processSelectedOption(2);
        assertEquals(ScreenOrchestrator.DAYS_SCREEN, ScreenOrchestrator.getCurrentScreen());
    }

    @Test
    void processSelectedOption_showTimes() {
        DaysScreen daysScreen = new DaysScreen();
        daysScreen.processSelectedOption(3);
        assertEquals(ScreenOrchestrator.TIMES_SCREEN, ScreenOrchestrator.getCurrentScreen());
    }
}