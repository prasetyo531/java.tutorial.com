package udemy;

public abstract class harimau extends hewan {

    //static methods cannot be annotated with @Override
    //@Override
    public static void bergerak(){

        System.out.println("berlari");
    }

    //@Override
    public static void membelaDiri(){

        System.out.println("mengigit");
    }

    //@Override
    public static void warna(){

        System.out.println("orange");
    }
}
