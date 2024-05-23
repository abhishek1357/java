package BasicJava.StreamApiDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,4,5,6,8,12);
        // below stream s1 gives us all values from nums, and we can do any operation on it without affecting nums
        Stream<Integer> s1 =  nums.stream();
        /*
        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };
         */

        Predicate<Integer> p = n -> n % 2 == 0;

        // simplified version for above code

        // filter will also return Stream
        Stream<Integer> s2 =  s1.filter(n -> n % 2 == 0);
        //s2.forEach(System.out::println);

        // we can use stream only once
        //s2.forEach(System.out::println); // Exception stream has already been operated upon or closed

        /*
        Function<Integer, Integer> f = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n) {
                return n*2;
            }
        };
         */


        Function<Integer, Integer> f = n -> n * 2;

        /*
         Map needs object of Function
         s2.map(f);
         simplified version:
         passing n->n*2 to map is same as passing function object f with above code because the object has object one method and its implementation we are actually providing in this lambda expression

         */
        Stream<Integer> s3 = s2.map(n->n*2);

        int result = s3.reduce(0, (a, b)-> a+b);

        System.out.println(result);

        // one liners
        List<Integer> ns = Arrays.asList(4,5,3,2,5,2,8,6,1);
        int res = ns.stream().filter(n->n%2==0).map(n->n*2).reduce(1, (a, b)->a*b);
        System.out.println(res);

    }
}
