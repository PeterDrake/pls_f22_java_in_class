public class Arity {

    static int f(int a, int... b) {
        int result = a;
        for (int x : b) {
            result += x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(f(4));
        System.out.println(f(5, 6, 7));
        System.out.println(f(4, new int[] {7, 2, 3}));
    }
}
