public class Shadow {

    private int x;

    public Shadow(int x) {
        int a = 0;
        int i;
        for (i = 0; i < 10; i++) {
            a += i;
        }
        this.x = i;
        this.x = a;
    }

    public static void main(String[] args) {
        Shadow s = new Shadow(5);
        System.out.println(s.x);
    }
}
