package chapter9d;

public class square extends rectangle {

    //overriding
    @Override
    public double calculatePerimeter(){
        return sides*4;
    }
}
