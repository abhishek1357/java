package JavaFeatures;

import java.util.ArrayList;
import java.util.List;

/*
* There are certain places, where wildcards, and type parameters do the same thing.
* But there are also certain places, where you have to use type parameters.*/
public class GenericsAndWildecards {
    public static void main(String[] args){

        List<Integer> intlist = new ArrayList<>();

        intlist.add(3);
        intlist.add(33);
        printList(intlist);
        wildcardPrint(intlist);
    }

    private static <T> void printList(List<T> mylist){
    System.out.println(mylist);

    }

    private static void wildcardPrint(List<?> mylist){
        System.out.println(mylist);
    }
}
