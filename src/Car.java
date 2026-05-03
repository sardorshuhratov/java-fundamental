public class Car {

    String model;
    String color;
    String number;
    int  year;
    int  km;
    int maxSpeed;
    Boolean state;

    void startOn(){
        System.out.println("Moshina o`t oldi...");
    }

    void startOff(){
        System.out.println("Moshina o`chdi...");
    }

    void drive (int distance) {
        km += distance;
        System.out.println("Moshina " + km + " km masofani bosib o'tdi");

    }

//    Car(String model, String color, String number, int year, int km, int maxSpeed, boolean state){
//        this.model=model;
//        this.color=color;
//        this.number=number;
//        this.year=year;
//        this.km=km;
//        this.maxSpeed=maxSpeed;
//        this.state=state;
//
//    }


    public Car (String model, String color, String number, int year, int km, int maxSpeed, Boolean state) {
        this.model = model;
        this.color = color;
        this.number = number;
        this.year = year;
        this.km = km;
        this.maxSpeed = maxSpeed;
        this.state = state;
    }
}
