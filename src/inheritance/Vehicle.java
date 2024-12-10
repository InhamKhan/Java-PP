package inheritance;

public class Vehicle {
  /* finalVariable Example
   final int gears = 5;
public static void main(String[] arg){
    Vehicle v1 = new Vehicle(2);
    v1.gears = 6;

}
   */

    int wheelsCount;

    String model;

    //Parent class ka constructor bana rhy han
    Vehicle(){
        System.out.println("Creating a vehicle instance");
    }

    Vehicle(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("Creating vehicle with wheels");
    }

    void start(){
        System.out.println("Vehicle is Starting...");
    }

 final void accelerate() {
System.out.println("Vehicle is accelerated");
}
    }
