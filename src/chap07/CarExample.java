package chap07;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        
        for (int i = 1; i <= 5; i++){
            int problemLocation = car.run();

            // System.out.println(problemLocation);
            switch(problemLocation){
                case 1:
                    System.out.println("앞 왼쪽 HankookTire 로 교체");
                    car.frontLeftTire = new HankookTire("앞왼쪽", 15);
                    System.out.println(car.frontLeftTire.getClass());
                    break;

                case 2:
                    System.out.println("앞 오른쪽 KumhoTire 로 교체");
                    car.frontRightTire = new KumhoTire("앞오른쪽", 13);
                    System.out.println(car.frontRightTire.getClass());
                    break;

                case 3:
                    System.out.println("뒤 왼쪽 HankookTire 로 교체");
                    car.backLeftTire = new HankookTire("뒤왼쪽", 14);
                    System.out.println(car.backLeftTire.getClass());
                    break;

                case 4:
                    System.out.println("뒤 오른쪽 KumhoTire 로 교체");
                    car.backRightTire = new KumhoTire("뒤 오른쪽", 17);
                    System.out.println(car.backRightTire.getClass());
                    break;
            }

            System.out.println("------------------------------");
        }
    }
}
