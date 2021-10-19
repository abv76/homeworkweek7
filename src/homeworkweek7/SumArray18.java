package homeworkweek7;

/*

18. Write a Java program to sum values of an array.
 */

public class SumArray18 {


    void sumOfArray() {

        // we declare the integer array
        int[] array = new int[8];
        array[0] = 5;
        array[1] = 6;
        array[2] = 7;
        array[3] = 8;
        array[4] = 9;
        array[5] = 10;
        array[6] = 11;
        array[7] = 12;

        // find the sum of these number
        int sum = 0;

        int lengthOfArray = array.length;

        for (int i = 0; i < lengthOfArray; i++) {
            sum = sum + array[i];

        }
        System.out.println(sum);
    }
    // Main method
    public static void main(String[] args) {
        SumArray18 obj = new SumArray18();  //Instance method calling by
        obj.sumOfArray();
    }
}
