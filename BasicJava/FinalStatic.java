package BasicJava;

/**
 * A final variable must be initialized exactly once. It can be initialized in three ways:
 * 1. Direct initialization when declared.
 * 2. Initialization in an instance initializer block.
 * 3. Initialization in a constructor.
 * <p>
 * A static variable is associated with the class rather than with instances of the class. It is initialized once when the class is loaded into memory. A static variable can be initialized in two ways:
 * 1. Direct initialization when declared.
 * 2. Initialization in a static initializer block.
 * <p>
 *   Initialization rules same for final static and static.
 *   Final static variables are using for constants.
 *   Final variables are thread safe.
 *   final variables are linked to instance whereas static variable linked to class.
 *   static variables are shared by instances.
 * */
public class FinalStatic {

    private final int final_x;

    private final int final_y = 10;

    private final int final_z;

    {//  called before constructor
        System.out.println("inside instance initializer block..");
        final_z=20;
    }

    private static int static_x=50;

    private static int static_y;

    static {
        static_y=100;
    }

    private final static int final_static_x = 1000;
    private final static int final_static_y;
    static {
        final_static_y=2000;
    }

    public FinalStatic(int x){
        System.out.println("inside constructor..");
        this.final_x = x;
    }

    @Override
    public String toString() {
        return "FinalStatic{" +
                "final_x=" + final_x +
                ", final_y=" + final_y +
                ", final_z=" + final_z +
                '}';
    }

    public static void  main(String[] args){
        FinalStatic finalStatic = new FinalStatic(10);
        System.out.println(finalStatic);
        System.out.println("Static vars = " + static_x + " " + static_y);
        System.out.println("final static vars = "+" "+ final_static_x + " "+final_static_y);



    }



}
