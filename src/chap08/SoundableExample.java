package chap08;

public class SoundableExample {
    private static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) throws Exception {
        printSound(new Cat());
        printSound(new Dog());
    }
}
