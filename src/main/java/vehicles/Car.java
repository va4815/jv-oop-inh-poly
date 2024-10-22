package vehicles;

public class Car extends Vehicle {

    public Car(int horsepower, FuelType fuelType, String make, String model) {
        super(make, model);
        this.engine = new CarEngine(horsepower, fuelType);
    }

    @Override
    protected void accelerate() {
        String message = make + " " + model + " speed: ";
        double fuelMod = switch (this.engine.getFuelType()) {
            case FuelType.Unleaded -> 1.5D;
            case FuelType.Leaded -> 1.2D;
            case FuelType.Diesel -> 1.8D;
            default -> throw new IllegalStateException("Unexpected value: " + this.engine.getFuelType());
        };
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println(message + String.format("%.2f", (engine.getHorsepower() * fuelMod) * Math.exp(Math.sqrt(i)) / 2));
        }
    }
}
