package BasicJava.CollectionsDemo;


/* collection api is concept, or the term used to refer to library
It is basically set of various implemented data structures

Collection is an interface

List , Queue, Set are interfaces which extends Collection interface

and we have corresponding classes which are implementation of above interfaces

e.g. ArrayList class implements List interface
Example of other implementations are below classes:
LinkedList, Dequeue, HashSet, LinkedHashSet

Apart for this we have Map interface too in collection api
Collection interface extends Iterable interface but Map don't that's why Map is not under Collection interface

*/

import java.util.*;


public class CollectionIntro {
    public static void main(String[] args) {

        // Raw use of parameterized class 'Collection'

//        Collection collection = new ArrayList();
//        collection.add(12);
//        collection.add(23);
//        collection.add("str"); because we added string, below for-loop will give error

//        for(Object o: collection){
//            System.out.println((Integer)o);
//        }

        // Now this works, we will be able to add only integer, but we dont have acces to useful methods
//        Collection<Integer> nums =  new ArrayList<Integer>();
//        nums.add(122);
//        nums.add(22);
//        System.out.println(nums);

        // this is how we should use:
        // Remember, always code for interface and not implementation
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(232);
        nums.get(1);
        nums.contains(12);

        nums.forEach(System.out::println);

        // Set demo
        Set<String> names = new HashSet<>();
        names.add("abhishek");
        names.add("siri");
        names.add("aarohi nandana");
        names.add("siri");

        names.forEach(System.out::println);

        // Map demo

        Map<Integer, String> id_names = new HashMap<>();
        id_names.put(1, "abhishek");
        id_names.put(2, "siri");
        id_names.put(10, "aarohi nandana");

        System.out.println(id_names);
        System.out.println(id_names.get(2));

        for(Integer key: id_names.keySet()){
            System.out.println(key+" : "+id_names.get(key));
        }

    }
}
