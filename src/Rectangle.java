public class Rectangle extends Shape {

    private int height;

    private int width;

    public Rectangle(int height, int width) {
        super("Red");
        this.height = height;
        this.width = width;
    }

    public double area() {
        return height * width;
    }

}
