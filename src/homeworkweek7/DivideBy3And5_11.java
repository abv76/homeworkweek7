package homeworkweek7;
//(11) Write a java program to print the numbers between 1 to 100 which can be divided by 3  and 5 separately.


public class DivideBy3And5_11 {


    public void m1() {                         // instance method
        System.out.println("Divided by 3: ");
        for (int i = 1; i < 100; i++) {           // for loop
            if (i % 3 == 0)
                System.out.println(i + "");

        }
        System.out.println(" Divided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.println(i + "");
        }

    }

    // main method

    public static void main(String[] args) {
        DivideBy3And5_11 obj = new DivideBy3And5_11();  // calling instance method via object
        obj.m1();

    }

}

