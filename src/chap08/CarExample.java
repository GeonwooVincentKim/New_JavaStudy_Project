package chap08;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        // System.out.println(myCar);
        myCar.run();

        myCar.frontLeftTire = new KumhoTire();
        myCar.frontRightTire = new KumhoTire();

        myCar.run();
    }
}
