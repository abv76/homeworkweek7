package homeworkweek7;
/*
Write a Java program to test if an array contains a specific value.
*/
public class ArraySpecific20 {

  // String contains() method

    public static boolean contains(int[] array, int item){
        for (int num : array){
            if (item==num){
                return true;
            }
        }
        return false;
    }

    //Main method
    public static void main(String[] args) {
        int[] my_array1= {5,6,7,8,9,10,11,12,13,43,45};
        System.out.println(contains(my_array1, 12));
        System.out.println(contains(my_array1, 20));

    }



}
