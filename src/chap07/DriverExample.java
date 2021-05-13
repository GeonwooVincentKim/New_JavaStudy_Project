package chap07;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        System.out.println(taxi);

        driver.drive(bus);
        driver.drive(taxi);
    }
}
