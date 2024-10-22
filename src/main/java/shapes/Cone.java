package shapes;

public class Cone extends Shape3D{
    private double height;

    public Cone(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return (base.calculateArea()*height)/3;
    }
}
