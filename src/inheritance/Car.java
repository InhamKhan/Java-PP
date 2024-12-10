package inheritance;

public class Car extends Vehicle {
    String color;

//    void accelerate(){
//
//    }

   void start() {
        Scooter scooterObj = new Scooter();
        scooterObj.braking(this);
        super.start();
        System.out.println(this);
        System.out.println(this.model + "  Car is Going to Started.....");
    }
    Car braking(){
       return this;
    }

    Car() {
        super(2);
        System.out.println("Car is being Created...");
    }

    public static void main(String[] arg) {
        Car obj = new Car();
        obj.accelerate();
        obj.wheelsCount = 4;
        obj.model = "toyota";
        obj.color = "black";
        obj.start();
        System.out.println(obj.wheelsCount);
    }


    class Scooter {

        void braking(Car car) {
            System.out.println(car.model + " is braking");
        }
    }
}