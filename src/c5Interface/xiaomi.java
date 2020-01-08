package c5Interface;

public class xiaomi implements handphone {

    @Override
    public void os() {

        System.out.println("xiaomi");
    }

    @Override
    public void powerOn() {

        System.out.println("nyalaiin hp xiaomi");
    }

    @Override
    public void powerOff() {

        System.out.println("matiin hp xiaomi");
    }

    @Override
    public void volumeUp() {

        System.out.println("volume up xiaomi");
    }

    @Override
    public void volumeDown() {

        System.out.println("volume down xiaomi");
    }
}
