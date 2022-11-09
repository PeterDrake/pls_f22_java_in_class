public class Loops {

    public static void main(String[] args) {
        int x = 0;
        while (x < 3) {
            System.out.println(x);
            x++;
        }

        do {
            System.out.println(x);
            x++;
        } while (x < 3);

        for (int i = 0; i < 4; i++) {
            System.out.println("i is " + i);
        }

        int[] a = {4, 7, 2};

        for (int n : a) {
            System.out.println(n);
        }
    }
}
