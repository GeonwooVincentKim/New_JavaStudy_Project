package chap07;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        // SupersonicAirplane sa = new SupersonicAirplane();
        // sa.takeOff();

        // sa.fly();
        // sa.flyMode = SupersonicAirplane.SUPERSONIC;
        // sa.fly();

        // sa.flyMode = SupersonicAirplane.NORMAL;
        // sa.fly();
        // sa.land();
        
        Airplane ap = new Airplane();
        Airplane bp = new SupersonicAirplane();
        
        System.out.println("1. 일반 비행기");
        ap.takeOff();
        System.out.println("2. 초음속 비행기");
        bp.takeOff();

        // bp.flyMode = SupersonicAirplane.SUPERSONIC; --> Compile-Error
    }
}
