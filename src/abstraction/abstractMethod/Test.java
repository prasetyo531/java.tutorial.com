package abstractMethod;

public class Test {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name = "kumi";
        cat.run();

        //polymorphism
        Animal an = new Cat();
        an.name = "eko";
        an.run();
    }
}
