public class Optional {

    private int z;

    public Optional() {
        this.z = 10;
    }

    int f(int x, int y) {
        return x * y + z;
    }

    int f(int x) {
        return f(x, 1);
    }

    public static void main(String[] args) {
        new Optional().run();
    }

    void run() {
        System.out.println(f(3, 4));
        System.out.println(f(3));
    }
}
