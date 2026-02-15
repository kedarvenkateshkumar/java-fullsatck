package Collections.Sets;

import java.util.Iterator;
import java.util.TreeSet;
public class Treeset {
    public static void main(String[] args) {
        
        //creating an empty TreeSet
        TreeSet<Integer> set = new TreeSet<>();
        
        //checking the tree is empty or not
        System.out.println("Checking the tree is empty or not : "+set.isEmpty());

        //Adding elements to TreeSet
        set.add(2);
        set.add(20);
        set.add(22);
        set.add(47);
        set.add(1);
        System.out.println("TreeSet: "+set);
        
        //Getting size() 
        System.out.println("Size of the treeset: "+set.size());

        //checking 20 is in set or not 
        System.out.println("checking 20 is in set: "+set.contains(20));

        //Getting  samallest element >= 8 
        System.out.println("Getting nearby value of 8: "+set.ceiling(8));

        //Getting  largest element <= 8 
        System.out.println("Getting nearby largest value of 8: "+set.floor(8));

        //descending order
        Iterator<Integer> it = set.descendingIterator();
        System.out.print("Decending order: [");
        while(it.hasNext()){ // checking iterator has next element or not

            System.out.print(" "+it.next().toString());
        }
        System.out.print(" ]");

        

    }
}
