package JavaXmasTest;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        System.out.println("Give me an Xmas wish!");
        Scanner in = new Scanner(System.in);
        char[] xmas_wish = in.nextLine().toCharArray();
        int i = xmas_wish.length-1;
        while(i != 0){
            System.out.print(xmas_wish[i]);
            i--;
        }
        System.out.print(xmas_wish[i]);
    }
}
