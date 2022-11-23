public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        super("Green");
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
