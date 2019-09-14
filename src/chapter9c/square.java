package chapter9c;

import java.awt.*;

public class square extends rectangle {

    //overriding
    @Override
    public double calculatePerimeter(){
        return sides*4;
    }
}
