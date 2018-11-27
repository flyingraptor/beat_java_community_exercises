package co.thebeat.ExerciseL;
import java.util.Scanner;

public class Main {

        public static void main(String[] args)

        {
            int i,j,r;
            System.out.print("Enter the number of diamond rows (half of the diamond) : ");
            Scanner in = new Scanner(System.in);
            r = in.nextInt();
            // int width = height * 2 -1;
            for(i=0;i<=r;i++) // 1st loop for column
            {
                for(j=1;j<=r-i;j++) // 3rd loop for space
                    System.out.print(" ");
                for(j=1;j<=2*i-1;j++) //2nd loop for rows
                    System.out.print("*");
                System.out.print("\n");
            }

            for(i=r-1;i>=1;i--)
            {
                for(j=1;j<=r-i;j++)
                    System.out.print(" ");
                for(j=1;j<=2*i-1;j++)
                    System.out.print("*");
                System.out.print("\n");
            }

        }
    }

