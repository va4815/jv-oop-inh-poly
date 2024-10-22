package shapes;

public class Circle extends Shape{


    public double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * (this.radius*this.radius);
    }
}
