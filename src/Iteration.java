import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iteration {

    public static void main(String[] args) {
        List<Integer> ls = new LinkedList<Integer>();
        ls.add(2);
        ls.add(5);
        ls.add(8);
        ls.add(1);
//        Iterator<Integer> iter = ls.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }
        for (int i : ls) {
            System.out.println(i);
        }
    }
}
