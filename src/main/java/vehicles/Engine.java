package vehicles;

public class Engine {
    private boolean running;
    private int horsepower;
    private FuelType fuelType;    // Unleaded, Leaded, Diesel

    public Engine(int horsepower, FuelType fuelType) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }
}
