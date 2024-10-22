package shapes;

public class Sphere extends Shape3D{

    public Sphere(Circle base){
        this.base = base;
    }
    @Override
    public double calculateVolume() {
        Circle circle = (Circle) this.base;
        return circle.calculateArea() * circle.radius * (4.0/3);
    }
}
