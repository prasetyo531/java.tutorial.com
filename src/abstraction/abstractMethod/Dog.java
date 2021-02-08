package abstractMethod;

public class Dog extends Animal{

    //error -->method run should avalaible on every class
    public void run() {
        System.out.printf("dog"+" "+name+" "+"is run");
    }
}
