package chapter6a;

public class classesObject {

    private double length;
    private double width;

    public classesObject(){

        length = 0;
        width = 0;
    }

    public classesObject(double length, double width){

        this.length = length;
        //this.width = width; //can be set this way

        setWidth(width); //or can be set this way. these are only different here to demo alternative options
    }

    public double getLength(){

        return length;
    }

    public void setLength(double length){

        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){

        this.width = width;
    }

    public double calculatePerimeter(){

        return (2 * length) + (2 * width);
    }

    public double calculateArea(){

        return length * width;
    }
}
