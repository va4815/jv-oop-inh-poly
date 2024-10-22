package vehicles;

public class Motocycle extends Vehicle {
    private boolean hasSidecar;

    public Motocycle(int horsepower, FuelType fuelType, boolean hasSidecar, String make, String model) {
        super(make, model);
        this.hasSidecar = hasSidecar;
        this.engine = new MotocycleEngine(horsepower, fuelType);
    }

}
