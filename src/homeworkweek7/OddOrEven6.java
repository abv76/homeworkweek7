package homeworkweek7;

/*
6. Write a java program to input any number and find out if it’s odd or even
 */


import java.util.Scanner;

public class OddOrEven6 {


    static void myCalculation(int num) {

        // if else condition

        if (num % 2 == 0)
            System.out.println(num + " is even number");
        else
            System.out.println(num + " is odd number");

    }

    // main method
    public static void main(String[] args) {
        Scanner testT = new Scanner(System.in);
        System.out.println(" Enter any number:  ");
        int num = testT.nextInt();
        OddOrEven6.myCalculation(num);    // calling static method via class name
        testT.close();
    }
}
