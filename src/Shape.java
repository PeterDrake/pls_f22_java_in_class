public class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double area() {
        return -1;
    }

    public void foo(Shape s) {
        System.out.println("Using the version that takes a Shape");
    }

    public void foo(Circle c) {
        System.out.println("Using the version that takes a Circle");
    }

}
