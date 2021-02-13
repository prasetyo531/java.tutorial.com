package multiInterface;

public class Audi implements Type{

    private double price;
    private String color;
    private String machine;

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

    @Override
    public String getMachine() {
        System.out.println(machine);
        return machine;
    }

    @Override
    public void setMachine(String Machine) {
        this.machine = machine;
    }
}
