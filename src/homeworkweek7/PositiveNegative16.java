package homeworkweek7;

import java.util.Scanner;

/* 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO” */

public class PositiveNegative16 {


    public void checkPositiveOrNegative(int num) {

        //check the number is greater than 0 or not
        if (num > 0) {

            System.out.println("The number is positive.");
        } else if (num < 0) {

            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is ZERO");

        }

    }       // Main method.


    public static void main(String[] args) {
        // object of the Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        // Reading a number from the user
        int num = sc.nextInt();
        PositiveNegative16 mn = new PositiveNegative16();  //calling instance method via object
        mn.checkPositiveOrNegative(num);
    }

}
