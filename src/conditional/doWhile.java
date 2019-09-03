package conditional;

import java.util.Scanner;

public class doWhile {

    public static void main (String args[]) {

        Scanner scanner = new Scanner(System.in);

        boolean kondisi = false;

        do{
            System.out.println("enter the first number");
            double nilai1 = scanner.nextDouble();

            System.out.println("enter the second number");
            double nilai2 = scanner.nextDouble();

            double sum = nilai1+nilai2;
            System.out.println("the sum is"+""+ sum);

            System.out.println("would you like to start over?");
            kondisi = scanner.nextBoolean();

        }
        while (kondisi);

        scanner.close();

    }
}
