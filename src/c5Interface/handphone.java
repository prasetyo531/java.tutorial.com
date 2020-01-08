package c5Interface;

public interface handphone {

    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void os();
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}
