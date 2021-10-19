package homeworkweek7;
/*
Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
*/


import java.util.Scanner;

public class Sales7 {

    void mySalesCommission(int salesId, String sellerName, double salesAmount, double basicSalary) {

        //  int salesId;
        // String sellerName;
        // double salesAmount,
        // basicSalary,
        double salesCommission = 0;


        // if condition

        if (salesAmount >= 500000.00) {
            salesCommission = salesAmount * 0.35;
        } else if (salesAmount >= 30000.00) {
            salesCommission = salesAmount * 0.2;
        } else if (salesAmount >= 20000.00) {
            salesCommission = salesAmount * 0.1;
        } else if (salesAmount >= 10000.00) {
            salesCommission = salesAmount * 0.05;
        } else if (salesAmount < 10000.00) {
            salesCommission = salesAmount * 0.02;
        }
        System.out.println("sales Commission: " + salesCommission);


    }

    //Main method

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input sales Id: ");
        int salesId = sc.nextInt();
        System.out.println("Enter seller's name");
        String sellerName = sc.next();
        System.out.println("Enter sales amount");
        double salesAmount = sc.nextFloat();
        System.out.println("Enter basic salary");
        double basicSalary = sc.nextDouble();

        Sales7 ac = new Sales7();
        ac.mySalesCommission(salesId, sellerName, salesAmount, basicSalary);     //instance method calling via object
    }


}
