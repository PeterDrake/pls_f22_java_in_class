public class NamedBreak {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            extracted(i);
        }
    }

    private static void extracted(int i) {
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                if (k == 1) {
                    return;
                }
                System.out.println(i + " " + j + " " + k);
            }
        }
    }
}
