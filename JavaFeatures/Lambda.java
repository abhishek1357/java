package JavaFeatures;

// https://www.youtube.com/watch?v=4HC_WyBSDGA

// Java program to demonstrate lambda expressions
// to implement a user defined functional interface.

// A sample functional interface (An interface with
// single abstract method
@java.lang.FunctionalInterface
interface Xyz
{
    void show();
}


public class Lambda
{
    public static void main(String args[])
    {
//        Xyz obj =  () ->
//            {
//                System.out.println("hiii");
//
//                System.out.println("multiple statement");
//            }; // This ; is needed

        Xyz obj = ()->System.out.println("single statement dont need brackets");
        obj.show();
    }
}



