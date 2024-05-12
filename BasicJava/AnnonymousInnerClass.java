package BasicJava;


class Fruit{

    public void Color(){
        System.out.println("Red");
    }
}

abstract class Animal{
    public abstract void species();
}

public class AnnonymousInnerClass {
    public static void main(String[] args){
        Fruit fruit =  new Fruit(){

            public void Color(){
                System.out.println("Red from anonymous class");
            }
//            public void shape(){
//                System.out.println("shape is round");
//            }
        };

//        fruit.shape(); // this wont work
        // anonymous class is same as using subclass, just that it doesnt have name, we cant typecast as we dont have name
        // Fruit type dont know about shape()

        fruit.Color();

        // example with abstract class

        Animal animal = new Animal() {
            public void species() {
                System.out.println("inside species method()");
            }
        };

        animal.species();


    }
}
