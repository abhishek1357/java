package JavaFeatures;

/*
Allows the compiler to determine the type of local variable based on the type of its initializer.
This feature can make code more concise and readable by reducing redundancy.

 */

class LMN{

}

public class VarDemo {

    //var x; // 'var' is not allowed here

    public static void main(String[] args) {

        int a = 9;
        var b = 8;
        System.out.println(a + " " + b );
        //var c; //Error:  have to be initialized, java cant infer type if we don't initialize

        var obj = new LMN(); // var can be used for obj also


    }

}
