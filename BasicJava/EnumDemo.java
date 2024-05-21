package BasicJava;
// Enums are named constants
/*
In Java, an enum is indeed a type of class, specifically a special kind of class that represents a group of constants.
Enums in Java are more powerful than the simple enums found in some other languages because they can have fields, methods,
and constructors, making them much more versatile.
 */
enum Status{
    Running, Failed, Pending, Success;
}

public class EnumDemo {
    public static void main(String[] args){
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status s2 = Status.Success;
        System.out.println(s2.ordinal());


        // get all constants
        Status[] statuses = Status.values(); // where is this method coming from

        for(Status status : statuses){
            System.out.println(status + " : "+ status.ordinal());
        }

        // comparisons
        if(s==Status.Running){
            System.out.println("within if " + s);
        }

        System.out.println(s.getClass().getSuperclass()); // class java.lang.Enum

    }
}
