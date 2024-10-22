import vehicles.Car;
import vehicles.FuelType;
import vehicles.Motocycle;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Car car = new Car(3, FuelType.Diesel, "BMW", "Model X");
        car.start();
        car.drive();

        Motocycle motocycle = new Motocycle(2, FuelType.Leaded, false, "BMW", "Model A");
        motocycle.drive();
        motocycle.start();
        motocycle.drive();

        System.out.println();

    }
}
