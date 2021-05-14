package chap08;

public interface RemoteControl{
    // Interface 가 아닌 General-Class(extends, abstract class 또한 포함) 에서는 
    // public static final int MAX_VOLUME = 10;
    // Instance Field -> Object 마다 가지고 있는 데이터
    // Static Field -> Object 모두가 다 함께 가지고 있는 공용 데이터

    public int MAX_VOLUME = 10; 
    public int MIN_VOLUME = 0;

    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);
}
