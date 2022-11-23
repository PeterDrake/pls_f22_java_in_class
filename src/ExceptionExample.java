import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample {

    static void causeAProblem() {
        try {
            int x = 5 / 0;
            System.out.println("Got here!");
        } catch (ArithmeticException e) {
            System.out.println("Passing it on.");
            throw e;
        } finally {
            System.out.println("... and I also did this");
        }
    }

    static void lookAtAFile() throws FileNotFoundException {
        FileReader fr = new FileReader("ExceptionExample.java");
    }

    public static void main(String[] args) throws FileNotFoundException {
//        lookAtAFile();
        try {
            causeAProblem();
        } catch (ArithmeticException e) {
            System.out.println("Long catch");
        }
    }
}
