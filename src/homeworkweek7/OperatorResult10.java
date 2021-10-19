package homeworkweek7;


/*
10.Write a java program to input any two number and ask user to enter their symbol (+, -,  /, *)
find addition, Subtraction, multiplication and division according to their symbol  (using if else)
 */

import java.util.Scanner;   // import scanner class

public class OperatorResult10 {


    // Static method
    static void myCalculation(int a, int b, char ch) {

        int result;

        // if ,else if, else  for multiple conditions

        if (ch == '+') {
            result = a + b;

            System.out.print("Result = " + result);
        } else if (ch == '-') {
            result = a - b;
            System.out.print(" Result = " + result);

        } else if (ch == '*') {
            result = a * b;
            System.out.print(" Result = " + result);

        } else if (ch == '/') {
            result = a / b;
            System.out.print(" Result = " + result);

        } else
            System.out.println(" Wrong Operator !!!");

    }
    // main method

    public static void main(String[] args) {
        Scanner yz = new Scanner(System.in);

        System.out.print(" Enter First number: ");
        int a = yz.nextInt();

        System.out.print(" Enter Second number: ");
        int b = yz.nextInt();

        System.out.print(" Enter Operator ( +, -, *, /) :  ");
        char ch = yz.next().charAt(0);
        OperatorResult10.myCalculation(a, b, ch);    // calling static method via class name
    }
}


