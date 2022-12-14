public class Overload {

    int instance = 3;

    int f(int x) {
        return instance;
    }

    int f(String s) {
        return instance * 2;
    }

    void g(int x, double y) {
        System.out.println("g 1");
    }

    void g(double x, int y) {
        System.out.println("g 2");
    }

    public static void main(String[] args) {
        Overload over = new Overload();
//        System.out.println(over.f(3));
//        System.out.println(over.f("Hello"));
        over.g(2.0, 3);
    }
}
