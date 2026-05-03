import java.sql.SQLOutput;

public class App {
    static void main (String[] args) {
        Car car1 = new Car("Malibu", "Black", "75 S077SH", 2024,  1500, 220, true );

//        System.out.println("=============Car1================");
//        car1.startOn();
//        System.out.println("Modeli: " + car1.model);
//        System.out.println("Rangi: " + car1.color);
//        System.out.println("Number: " + car1.number);
//        System.out.println("Year: " + car1.year);
//        System.out.println("Km: " + car1.km);
//        System.out.println("MaxSpeed: " + car1.maxSpeed);
//        System.out.println("State: " + car1.state);
        System.out.println(car1.km);
        car1.drive( 200 );
        System.out.println(car1.km);

    }
}
