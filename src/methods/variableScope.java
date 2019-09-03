package methods;

import java.util.Scanner;

public class variableScope {

    //global variables
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        double s = getSalary(); //local memory dan g kepake di method yg lain
        int c = getCreditScore(); //local memory dan g kepake di method yg lain
        scanner.close();

        //Check if the user is qualified
        boolean qualified = isUserQualified(c, s);

        //Notify the user
        notifyUser(qualified);

    }

    public static double getSalary(){   //g pake void makanya ada return
        System.out.println("Enter your salary:");

        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){     //g pake void makanya ada return
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditScore, double salary){  //g pake void makanya ada return
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }
        else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){     //g pake void makanya ada return
        if(isQualified){
            System.out.println("Congrats! You've been approved.");
        }
        else{
            System.out.println("Sorry. You've been declined");
        }
    }
}
