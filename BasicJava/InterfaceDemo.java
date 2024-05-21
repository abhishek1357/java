package BasicJava;


interface SimpleInterface{
//    int id; // all variables in interface are final and static, so we need to initialize them

    int id=10;

    void show(); // by-default all methods in interface are public abstract

    void config();

}

interface SimpleInterface2{
    int id=20;// this wont work because id variable is final and cant be modified

    int myid = 20; // new variable works
    void config();
}
class SimpleImplementation implements SimpleInterface, SimpleInterface2{


    public void show() {

        System.out.println("in show()");
    }

    public void config() {
        System.out.println("in config()");
    }

}

public class InterfaceDemo {
    public static void main(String[] args){
//        SimpleInterface obj= new SimpleInterface() ; // can not create object of interface

        SimpleInterface obj;
        obj= new SimpleImplementation();
        obj.config();
        obj.show();
        System.out.println(obj.id);
        SimpleImplementation s = new SimpleImplementation();
        System.out.println(s.myid);
        System.out.println(SimpleInterface.id);


//        SimpleInterface.id=20; // cant not change final value


    }
}
