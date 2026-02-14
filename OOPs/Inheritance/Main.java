package Inheritance;

class Vehical{
    String brand;
    int speed;

    public Vehical(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
        System.out.println(brand+ " car " + "speed is: "+speed +"KM/HR");
    }
    public void fuelUp(){
        System.out.println("The vehical is refueling.");
    }
}
class Car extends Vehical{
    int batteryLevel;
    public Car(String brand,int speed,int batteryLevel){
        super(brand, speed);
        this.batteryLevel = batteryLevel;
        System.out.println("Electrical car constructor called..");

    }
    @Override
    public void fuelUp(){
        System.out.println("The battery is recharging and the current battery level is:"+batteryLevel+"%");
    }

}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("tesla",200,40);
        car.fuelUp();
    }
    
}
