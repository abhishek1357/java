package BasicJava;

// Functional Interface is a interface which has only one method
@FunctionalInterface
interface FunA{
    void show(int a);
    //void edit(); //this will give error because we are showing intent to compiler that we want functional interface using @FunctionalInterface annotation
}


public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
//        FunA a = new FunA() {
//            @Override
//            public void show(int a) {
//                int b= 20;
//                System.out.println("res = "+ a+b);
//            }
//        };

        FunA f = (int a)->{ // this is lambda, which is syntactical sugar for above anonymous class implementation for
            // functional interface, as there will be only one method, compiler can figure out
            int b=20;
            System.out.println("res = "+ a+b);
        };

        FunA ff = (int a)-> System.out.println("res = "+ a+20); // if single line then no need for brackets too!

        f.show(10);

        ff.show(20);
    }
}
