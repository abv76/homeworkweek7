package homeworkweek7;

//(12)Write a program that tells us input value is number or an alphabet or symbol.


import java.util.Scanner;

public class AlphabetSymbol12 {

    void myData(char ch) {
        // if else condition
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an alphabet.");
        } else if ((ch >= '0' && ch <= '9')) {
            System.out.println(ch + " is a number.");
        } else {
            System.out.println(ch + " is a symbol");
        }
    }

    // main method
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);          // import Scanner class
        System.out.println("Enter any Value:  ");
        char ch = ab.next().charAt(0);
        AlphabetSymbol12 obj = new AlphabetSymbol12();     // calling instance method via object creation
        obj.myData(ch);
        ab.close();
    }
}
