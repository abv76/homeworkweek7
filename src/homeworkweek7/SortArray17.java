package homeworkweek7;

/*
(17) Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class SortArray17 {
          // Instance method

    void sortArray(){

        int[] arrayData1=    { 27, 45,23,78,12,34,23,41,56,89,67,90};
        String[] arrayData2= { "UK", "FR","SCO", "DE", "IND","AU","SRI" };

        System.out.println("Original value: " + Arrays.toString(arrayData1));
        Arrays.sort(arrayData1);
        System.out.println("Sorted value  : " +   Arrays.toString(arrayData1));

        System.out.println("Original value: " + Arrays.toString(arrayData2));
        Arrays.sort(arrayData2);
        System.out.println("Sorted value  : "  +   Arrays.toString(arrayData2));
    }
     // Main method
    public static void main(String[] args) {
        SortArray17 ab= new SortArray17();   // instance method calling via object
        ab.sortArray();
    }

}



