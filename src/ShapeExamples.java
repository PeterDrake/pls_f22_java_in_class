import java.util.ArrayList;
import java.util.List;

public class ShapeExamples {

    public static void main(String[] args) {
//        Rectangle r = new Rectangle(3, 5);
//        System.out.println(r.area());
//        Circle c = new Circle(2);
//        System.out.println(c.area());

        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Rectangle(3, 5));
        shapes.add(new Circle(2));
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(2, 10));
        for (Shape s : shapes) {
            System.out.println(s.area());
            System.out.println(s.getColor());
        }

    }

}
