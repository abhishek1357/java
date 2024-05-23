package BasicJava.CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,5,24,21,4,12);

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.print(i);
            }
        };
        nums.forEach(consumer);
        System.out.print("\n");
        // better version
        Consumer<Integer> consumer2 = i -> System.out.print(i);
        nums.forEach(consumer2);
        System.out.print("\n");
        // less understandable version
//        Consumer<Integer> consumer3 = System.out::print;
//        nums.forEach(consumer3);

        // best version using method reference
        nums.forEach(System.out::print);

    }
}
