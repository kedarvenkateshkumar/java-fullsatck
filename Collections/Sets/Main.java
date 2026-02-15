package Collections.Sets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(20);
        set.add(12);
        set.add(24);
        set.add(66);
        System.out.println(set);
        set.remove(12);
        System.out.println("After removing 12: ");
        System.out.println(set);
        System.out.println("Is the set contains 24? : "+set.contains(4));
        System.out.println("The size of the set is: "+set.size());
    }
}
