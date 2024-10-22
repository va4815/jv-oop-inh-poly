package vehicles;

public class Engine {
    private boolean running;
    private int horsepower;
    private FuelType fuelType;    // Unleaded, Leaded, Diesel

    public Engine(int horsepower, FuelType fuelType) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }

    public void start() {
        this.running = true;
    }

    public boolean isRunning() {
        return running;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getHorsepower() {
        return horsepower;
    }
}
