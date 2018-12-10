package co.thebeat.ExerciseN;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TimesScreen {

    private int selectedTime;

    public int showOptionsAndGetUserInput() {

        int userInput;

         do {
            showUserOptions();
             userInput = getUserInput();

            if(userInput < 1 || userInput > 6) {
                System.out.println("Not acceptable value.");
            }
        } while (userInput < 1 || userInput > 6);

        if(userInput==6) {
            selectedTime = -1;
            ScreenOrchestrator.setCurrentScreen(ScreenOrchestrator.DAYS_SCREEN);
        } else {
            selectedTime = userInput;
        }

        return userInput;
    }

    public void processSelectedOption(int option) {

        switch (option) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: {
                ScreenOrchestrator.setCurrentScreen(ScreenOrchestrator.LESSON_SCREEN);
                break;
            }
            case 6: {
                ScreenOrchestrator.setCurrentScreen(ScreenOrchestrator.DAYS_SCREEN);
                break;
            }
        }
    }

    public int getSelectedTime() {
        return selectedTime;
    }

    private void showUserOptions() {
        System.out.println();
        System.out.println("Please select a time to Add/Update a lesson:");
        System.out.println("1. 09:00");
        System.out.println("2. 10:00");
        System.out.println("3. 11:00");
        System.out.println("4. 12:00");
        System.out.println("5. 13:00");
        System.out.println("6. Back");
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
