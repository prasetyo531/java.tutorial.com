package chapter6a;

import java.util.Scanner;

public class asMethodParam {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        asMethodParam calculator = new asMethodParam();

        classesObject kitchen = calculator.getRoom();
        classesObject bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);

        calculator.scanner.close();

    }

    public classesObject getRoom(){

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new classesObject(length, width);
    }

    public double calculateTotalArea(classesObject rectangle1, classesObject rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

}
