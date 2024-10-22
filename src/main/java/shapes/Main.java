package shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(5),
                new Rectangle(2, 5),
                new Triangle(3, 7)
        );

        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " area = " + shape.calculateArea());
        }

        List<Shape3D> shapes3d = new ArrayList<>(List.of(new Cube(5)));

        for (Shape shape : shapes) {

            if (shape instanceof Circle circle) {
                shapes3d.add(new Sphere(circle));
                shapes3d.add(new Cylinder(circle, 5));
                shapes3d.add(new Cone(circle, 5));
            }

            else {
                shapes3d.add(new Prism(shape, 5));
                shapes3d.add(new Pyramid(shape, 5));
            }

        }

        for (Shape3D shape3d : shapes3d) {
            System.out.println(shape3d.getClass().getSimpleName() + " with " +
                    shape3d.getBase().getClass().getSimpleName() + " base | Volume = " +
                    shape3d.calculateVolume());
        }

    }
}
