package chapter6a;

public class instantiatingObject {

    //dont need if import as long as classes from same package

    public static void main(String args[]){

        /*******************
         * RECTANGLE 1
         ********************/

        //Create instance of Rectangle class
        classesObject room1 = new classesObject();
        room1.setWidth(15);
        room1.setLength(10);
        double areaOfRoom1 = room1.calculateArea();

        /*******************
         * RECTANGLE 2
         ********************/

        //Create instance of Rectangle class
        classesObject room2 = new classesObject(30, 75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of both rooms: " + totalArea);
    }
}
