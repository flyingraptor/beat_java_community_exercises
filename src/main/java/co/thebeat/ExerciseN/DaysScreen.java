package co.thebeat.ExerciseN;

import java.util.Scanner;

public class SecondScreen {

    public int showScreen() {

        int screen1UserSelection = showOptionsAndGetInput();

        while (screen1UserSelection < 1 || screen1UserSelection > 3) {
            System.out.println("Not acceptable value.");
            screen1UserSelection = showOptionsAndGetInput();
        }

        return screen1UserSelection;
    }

    public void processScreenOption(int option) throws ExitScreenException {

        //TODO

        if(option == 1) {
            //TODO
        } else if(option == 2) {
            //TODO
        } else if(option == 3) {
            //TODO
        } else if(option == 4) {
            //TODO
        } else if(option == 5) {
            //TODO
        } else {
            throw new ExitScreenException();
        }
    }

    private int showOptionsAndGetInput() {

        System.out.println("Please select one of the following options:");
        System.out.println("1. View the weekly lessons schedule");
        System.out.println("2. Add/Update a lesson for a day and time");
        System.out.println("3. Close Program");

        Scanner screen1UserInput = new Scanner(System.in);
        System.out.print("Input: ");
        int screen1UserSelection = screen1UserInput.nextInt();
        return screen1UserSelection;
    }
}
