package abstractions;

public class LearnAbstract {

    public static void main(String[] arg) {
        //  Vehicle v1 = new Vehicle();
        Car c1 = new Car();
        c1.accelerate();
        c1.brakes(4);
        c1.honks();
    }
}
class Human {
    void speak(){
    }
    void eat(){

    }
}
    abstract class Vehicle{

        abstract void accelerate();

        abstract int  brakes(int wheels);

        void honks(){
            System.out.println("Vehicle is Honks");
        }

    }
    class Scooter extends Vehicle{

        @Override
        void accelerate() {
        }
        @Override
        int brakes(int wheels) {
            return 0;
        }
    }

class Car extends Vehicle{
    @Override
    void accelerate() {
        System.out.println("Car is accelerating");
    }
    int brakes(int wheels) {
        System.out.println("Car brakes are pushed");
        return wheels;
    }
    void honks(){
        System.out.println("Car is honked");
    }
}
