package chap08;

public class SmartTelevisionExample {
    public static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();

        RemoteControl rc = tv;
        Searchable searchable = tv;
        rc.turnOn();
        rc.setVolume(5);
        searchable.search("KBS");
        rc.turnOff();
    }
}
