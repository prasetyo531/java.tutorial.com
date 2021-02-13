package multiInterface;

public class Order {

    public static void main(String[] args) {

        Type tp = new Audi();
        tp.setPrice(200);
        tp.getPrice();

        tp.sound();

        tp.character();
    }
}
