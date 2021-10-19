package homeworkweek7;

/*
 Write a java program to input student Name, roll No, and three subjects Math, Science and  English marks
 (marks is between 0 to 100 and if it is out of range print error message “Invalid  Input, Marks should between 0 to 100”)
  and find out total, percentage and result. If he is pass or fail on basis of percentage (pass>=35) and also give them grade
if %> = 80 A+,  %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

import java.util.Scanner;

public class MarkSheet3 {

    static void results() {

        Scanner mk = new Scanner(System.in);
        System.out.println("\n Mark Sheet");
        System.out.print("Enter Name of the student\t:\t");
        String name = mk.next();
        //System.out.print("Enter the roll number \t\t:\t");
        System.out.print("Enter the roll number:");
        String roll = mk.next();
        System.out.print("\nEnter the Marks of Math\t:\t");
        int math = mk.nextInt();
        if (math >= 100) {
            System.out.println("invalid number");
        }
        System.out.print("Enter the Marks of Science\t:\t");
        int sci = mk.nextInt();
        if (sci >= 100) {
            System.out.println("invalid number");
            System.out.print("Enter the Marks of English\t:\t");
            int eng = mk.nextInt();
            if (eng >= 100) {
                System.out.println("invalid number");
            }
            int total;
            total = (math + sci + eng);
            float percent;
            percent = total / 3;
            String grade = "";
            String result = "";

            // condition 1 with if else
            if ((math >= 0 && math <= 100) || (sci >= 0 && sci <= 100) || (eng >= 0 && eng <= 100)) {

                System.out.println("Invalid Input,Marks should between 0 to 100");

            }
// condition two using if else statement
            if (percent >= 80) {
                grade = "A+";
                result = "pass";
            } else if (percent >= 60) {
                grade = "A";
                result = "pass";
            } else if (percent >= 50) {
                grade = "B";
                result = "pass";
            } else if (percent >= 35) {
                grade = "C";
                result = "pass";
            } else {
                result = "Fail";

            }

            // condition three using if else statement
            if ((math <= 34) || (sci <= 34) || (eng <= 34)) {
                result = "Fail";
            }


            System.out.println("--------------------------------------- ");
            System.out.println("|                                       |");
            System.out.println("| Mark Sheet                            |");
            System.out.println("|_____________________________________ _|");
            System.out.println("| Name :    " + name + "|");
            System.out.println("| Roll No:   " + roll + "|");
            System.out.println("|-------------------------------------- |");
            System.out.println("| Subjects : Marks                      |");
            System.out.println("|______________________________________ |");
            System.out.println("| Math :     " + math + "|");
            System.out.println("| Science :  " + sci + "|");
            System.out.println("| English :  " + eng + "| ");
            System.out.println("| ______________________________________|");
            System.out.println("| Total:  " + total + "|");
            System.out.println("| ______________________________________|");
            System.out.println("| Percentage :  " + percent + "|");
            System.out.println("| Result :      " + result + "|");
            System.out.println("| Grade :       " + grade + "| ");
            System.out.println("| _______________________________________");


        }
    }
        // main method

    public static void main(String[] args) {

        results();              //calling static method via class name


    }

}