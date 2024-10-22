package vehicles;

public abstract class Vehicle {
    protected String make;
    protected String model;
    private double speed;
    protected Engine engine;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void start() {
        this.engine.start();
        System.out.println(make + " " + model + " is starting.");
    }

    public void drive() {
        if (!engine.isRunning()) {
            System.out.println(make + " " + model + " is not running.");
        } else {
            System.out.println("I am driving " + make + " " + model + ".");
        }
    }

    protected abstract void accelerate();

}
