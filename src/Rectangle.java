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

    public double hypotenuse() {
        return Math.sqrt(height * height + width * width);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(3, 4);
        System.out.println(r.hypotenuse());
    }
}
