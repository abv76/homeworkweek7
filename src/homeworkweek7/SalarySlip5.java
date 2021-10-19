package homeworkweek7;

/*
WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee Name : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================|d


 */


import java.util.Scanner;

public class SalarySlip5 {

    void mySalarySlip(){

        Scanner ab= new Scanner(System.in);  // import scanner class
        System.out.println("Enter Employee ID");
        int employeeId= ab.nextInt();
        System.out.println("Enter Employee Name");
        String nm= ab.next();
        System.out.println("Enter Basic Salary");
        double sal= ab.nextInt();

            double da, hra, ta, pf, gs = 0.0;

            da = 0.08 * sal;
            hra = 0.1 * sal;
            ta = 0.09 * sal;
            pf = 0.2 * sal;

            gs = (sal + da + hra + ta) - pf;     // formula to find gross salary


            System.out.println(" | -------------------------------------- |");
            System.out.println(" | Salary Slip                            |");
            System.out.println(" | -------------------------------------- |");
            System.out.println(" | Employee Id   : " + employeeId +      '|');
            System.out.println(" | Employee Name : " + nm +              '|');
            System.out.println(" | -------------------------------------- |");
            System.out.println(" | Basic Salary  :     " + sal +         '|');
            System.out.println(" | HRA 10%       :     " + hra+          '|');
            System.out.println(" | TA 8%         :     " + ta +          '|');
            System.out.println(" | DA 9%         :     " + da +          '|');
            System.out.println(" | PF -20&       :     " + pf +          '|');
            System.out.println(" |--------------------------------------- |");
             System.out.println("| Gross Salary  :     " + gs +          '|');
            System.out.println( "| =======================================|");

        }




    public static void main(String[] args) {
      SalarySlip5 wage= new SalarySlip5();           // calling instance method via object in main method
      wage.mySalarySlip();
    }


}
