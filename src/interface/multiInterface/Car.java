package multiInterface;

public interface Car {

    double getPrice();
    void setPrice(double price);

    String getColor();
    void setColor(String color);

    void sound();

    //default method --> add method only at interface dont make error implementation in subclass
    default void character() {
        System.out.println("agresive");
    }
}
