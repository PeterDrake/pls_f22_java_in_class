public class Switch {

    public static void main(String[] args) {
        int x = 0;

        switch (x) {
            case 0:
            case 1:
                System.out.println("It's not more than 1");
                break;
            default:
                System.out.println("I can't count that high, my dude");
        }
    }
}
