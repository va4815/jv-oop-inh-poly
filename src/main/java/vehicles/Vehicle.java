package vehicles;

public abstract class Vehicle {
    private String make;
    private String model;
    private double speed;
    protected Engine engine;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
}
