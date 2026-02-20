package java8_Features.StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class Streams {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(21,43,23,10,20,6,8);

        //Predicate for filter the stream (implementing inner working of filter)
        Predicate<Integer> p = t -> t%2==0;

        //Function for maping the stream (implementing inner working of map)
        Function<Integer,Integer> fun = t -> t*2;

        //Consumer for forEach loop (implementing inner working of forEcah)
        Consumer<Integer> con = t -> System.out.println(t);
            
        
         arr.stream()
            .filter(p)
            .map(fun)
            .sorted()
            .forEach(con);


        // Stream<Integer> s1 = arr.stream();
        
        // Stream<Integer> s2 = s1.filter(n -> n%2 ==0 );
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0,(c,e) -> c+e);

        // s3.forEach(n -> System.out.println(n));
        // System.out.println(result);

    }
}
