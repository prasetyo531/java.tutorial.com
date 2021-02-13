package multiInterface;

public class Audi implements Type{

    private double price;
    private String color;
    private String machine;
    private String function;

    @Override
    public double getPrice() {
        System.out.println(price);
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getColor() {
        System.out.println(color);
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void sound() {
        System.out.println("brem brem");
    }

    @Override
    public String getMachine() {
        System.out.println(machine);
        return machine;
    }

    @Override
    public void setMachine(String Machine) {
        this.machine = machine;
    }

    @Override
    public String getFunction() {
        System.out.println(function);
        return function;
    }

    @Override
    public void setFunction(String function) {
        this.function = function;
    }
}
