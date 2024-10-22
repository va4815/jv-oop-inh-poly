package shapes;

public class Cone extends Shape3D{
    private double height;
    @Override
    public double calculateVolume() {
        return (base.calculateArea()*height)/3;
    }
}
