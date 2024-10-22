package shapes;

public class Sphere extends Shape3D{

    public Sphere(Circle base){
        this.base = base;
    }
    @Override
    public double calculateVolume() {

        return 0;
    }
}
