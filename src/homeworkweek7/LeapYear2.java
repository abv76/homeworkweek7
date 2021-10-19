package homeworkweek7;

/*
Write a java program to input any year like (ex.2007) and find out if it is leap year or  not?
*/
/*
Logic:1. It is evenly divisible by 100
2. If it is divisible by 100, then it should also be divisible by 400
3. Except this, all other years evenly divisible by 4 are leap years.
 */


import java.util.Scanner; // Scanner class calling

public class LeapYear2 {


    // Static method
    static void m1(int year) {
       // int year;
       // System.out.println(" Enter an Year ::  ");


        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {

            System.out.println( year +  "  specified year is a leap year");

        } else {
            System.out.println( year + "  Is not a leap year ");
        }
    }

    // Main method
    public static void main(String[] args) {
        System.out.println(" Enter an Year ::  ");
        Scanner ab = new Scanner(System.in);
        int year = ab.nextInt();
        LeapYear2.m1(year);  // calling static to static method via classname
       ab.close();
    }

}