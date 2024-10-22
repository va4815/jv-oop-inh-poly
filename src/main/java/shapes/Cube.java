package shapes;

public class Cube extends Shape3D{

    private Cube(Rectangle base) {
        this.base = base;
    }

    public Cube(double size){
        this(new Rectangle(size, size));
    }
    @Override
    public double calculateVolume() {
        Rectangle rectangle = (Rectangle) this.base;
        return rectangle.calculateArea() * rectangle.width;
    }

}
