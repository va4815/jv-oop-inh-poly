package shapes;

public abstract class Shape3D {
    public Shape getBase() {
        return base;
    }

    protected Shape base;
    public abstract double calculateVolume();
}
