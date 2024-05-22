package BasicJava;

// Functional Interface is a interface which has only one method
@FunctionalInterface
interface FunA{
    void show(int a);
    //void edit(); //this will give error because we are showing intent to compiler that we want functional interface using @FunctionalInterface annotation
}

@FunctionalInterface
interface FunB{
    int add(int a, int b);
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

        FunA ff = (int a)-> System.out.println("res = "+ a); // if single line then no need for brackets too!

        FunA fff = (a)-> System.out.println("res = "+ a); // no need to mention type of method variable also

        FunA ffff =  a -> System.out.println("res = "+ a); // no parenthesis needed if only one variable

        f.show(10);

        ff.show(20);
        fff.show(10);
        ffff.show(12);

//        FunB funB = (a, b) ->  return a+b; // if we have only one statement and that is return, then we need to write without return
        FunB funB = (a, b) ->   a+b;

        System.out.println(funB.add(10, 20));

    }
}
