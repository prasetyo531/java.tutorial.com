package udemyVinsguru;

public class staticPolymorphism {

    public int getArea(int a){
        return a * a;
    }

    public double getArea(Double a){
        return a * a;
    }

    public int getArea(int length, int width){
        return length * width;
    }

    public double getArea(double length, int width){
        return  length * width;
    }

    public static void main(String[] args) {

        staticPolymorphism s = new staticPolymorphism();

        System.out.println("get area only int:" + " "+ s.getArea(0102));
        System.out.println("get area only double:" + " "+ s.getArea(30.5));
        System.out.println("get area int and int:" + " "+ s.getArea(10,2));
        System.out.println("get area double and int:" + " "+ s.getArea(12.2,5));
    }
}
