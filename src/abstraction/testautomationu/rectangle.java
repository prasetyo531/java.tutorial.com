package testautomationu;

public class rectangle extends shape {

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //constructor
    public rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    //@Override
    double calculate() {
        return length * width;
    }
}
