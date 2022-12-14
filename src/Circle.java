public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        super("Green");
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void foo(Shape s) {
        System.out.println("The third method!");
    }

    public static void main(String[] args) {
        Shape s = new Circle(4);
        System.out.println(s.area());
        Shape t = new Circle(10);
        s.foo((Circle)t);
    }
}
