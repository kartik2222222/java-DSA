import java.util.HashSet;
import java.util.Iterator;

public class hashset_program {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();
        // adding elements to set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);// trying to add same element that added before
        System.out.println(set);
        // searching an element in the set by using contains
        if (set.contains(1)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        if (set.contains(6)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        // removing an element from set
        set.remove(1);
        System.out.println(set);
        // finding the size of the hashset by using size()method
        System.out.println(set.size());

        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
