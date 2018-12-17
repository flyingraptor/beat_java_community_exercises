package co.thebeat.ExerciseN;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InitialScreen {

    public int showOptionsAndGetUserInput() {

        int userInput;

        do {
            showUserOptions();
            userInput = getUserInput();

            if(userInput < 1 || userInput > 3) {
                System.out.println("Not acceptable value.");
            }

        } while (userInput < 1 || userInput > 3);

        return userInput;
    }

    public void processSelectedOption(int option) {

        if (option == 1) {
            WeeklySchedule.show();
            ScreenOrchestrator.setCurrentScreen(ScreenOrchestrator.INITIAL_SCREEN);
        } else if (option == 2) {
            ScreenOrchestrator.setCurrentScreen(ScreenOrchestrator.DAYS_SCREEN);
        } else {
            ScreenOrchestrator.setCurrentScreen(ScreenOrchestrator.EXIT);
        }
    }

    private void showUserOptions() {
        System.out.println();
        System.out.println("Please select one of the following options:");
        System.out.println("1. View the weekly lessons schedule");
        System.out.println("2. Add/Update a lesson for a day and time");
        System.out.println("3. Close Program");
    }

    private int getUserInput() {

        Scanner consoleInput = new Scanner(System.in);
        System.out.print("Input: ");

        boolean userInputIsNotANumber;
        int userSelectedOption = 0;

        do {
            try {
                userSelectedOption = consoleInput.nextInt();
                userInputIsNotANumber = false;
            } catch (InputMismatchException ime) {
                userInputIsNotANumber = true;
                System.out.println("Please enter a number.");
                consoleInput = new Scanner(System.in);
            }
        } while(userInputIsNotANumber);

        return userSelectedOption;
    }
}