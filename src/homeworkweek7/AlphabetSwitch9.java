package homeworkweek7;
/*
(9) Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 Same as above program-8 using switch statement.
*/

import java.util.Scanner;

public class AlphabetSwitch9 {

    void cityName(char city) {


        switch (city)                                 // switch statement
        {
            case ('A'):
            case ('a'):
                System.out.println("Ahmedabad");
                break;

            case ('B'):
            case ('b'):
                System.out.println("Bhopal");
                break;

            case ('c'):
            case ('C'):
                System.out.println("Cochin");
                break;
            case ('d'):
            case ('D'):
                System.out.println("Delhi");
                break;

            case ('e'):
            case ('E'):
                System.out.println("Elora");
                break;

            case ('f'):
            case ('F'):
                System.out.println("Faridabad");
                break;

            default:
                System.out.println("Invalid Entry");
                break;
        }

    }
    // main method

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // import Scanner class
        System.out.println("Input Alphabet");
        char city = sc.next().charAt(0);
        AlphabetSwitch9 ct = new AlphabetSwitch9();   // calling instance method in main method via object
        ct.cityName(city);

    }

}
