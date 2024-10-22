package vehicles;

public class Car extends Vehicle {

    public Car(int horsepower, FuelType fuelType, String make, String model) {
        super(make, model);
        this.engine = new CarEngine(horsepower, fuelType);
    }
}
