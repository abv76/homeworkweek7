package homeworkweek7;

/*
Write a java program that tells us that Input number is odd or even?  HINT: use ternary operator ( ? :)
*/

import java.util.Scanner;

public class OddEven1 {



    void m1(int num){    // Instance Method
        String evenOdd = (num % 2==0) ? "even" : "odd";   // ternary operator: is also known as conditional operator:

        // is used to evaluate boolean expression.The goal of the operator is to decide , which value should be assigned to the variable.
        System.out.println( num + " is " + evenOdd);

    }
  // Main method
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();


        OddEven1 obj = new OddEven1();
        obj.m1(num);    // Calling Instance method via object
        sc.close();
    }
}

