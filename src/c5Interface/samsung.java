package c5Interface;

public class samsung implements handphone {

    /*
    setelah nulis implements, bakal ada option to implement method
     */

    @Override
    public void os() {

        System.out.println("samsung");
    }

    @Override
    public void powerOn() {

        System.out.println("nyalaiin hp samsung");
    }

    @Override
    public void powerOff() {

        System.out.println("matiin hp samsung");
    }

    @Override
    public void volumeUp() {

        System.out.println("naikin volume hp samsung");
    }

    @Override
    public void volumeDown() {

        System.out.println("nurunin volume hp samsung");
    }
}
