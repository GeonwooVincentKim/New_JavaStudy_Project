package chap10;

import static java.lang.System.out;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        changeCat(cat);
    }

    public static void changeDog(Animal animal){
        Dog dog = (Dog) animal;
        out.println(dog + " " + "멍멍");
    }
    
    public static void changeCat(Animal animal){
        Cat cat = (Cat) animal;
        out.println(cat + " " + "야옹");
    }
}


class Animal{}
class Dog extends Animal {}
class Cat extends Animal {}
