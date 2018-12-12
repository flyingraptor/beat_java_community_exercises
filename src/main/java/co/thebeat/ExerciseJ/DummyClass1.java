package co.thebeat.ExerciseJ;

public class DummyClass1 {


    public static void main(String[] args) {


        for (int i=0; i<7; i++)
        {
            // Draw the spaces before each row
            for (int j=0; j<7-i; j++)
            {
                System.out.print(" ");
            }

            // Draw the asterisks for each row
            for (int j=0; j < 2*i+1; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // Draw the downward point of the diamond
        for (int i=5; i>=0; i--)
        {
            // Draw the spaces before each row
            for (int j=0; j<7-i; j++)
            {
                System.out.print(" ");
            }

            // Draw the asterisks for each row
            for (int j=0; j < 2*i+1; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}

