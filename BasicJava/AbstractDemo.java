package BasicJava;
abstract class SimpleAbstractClass {

    public abstract void getStatus();

    public void show(){
        System.out.println("In abstract demo class");
    }
}

class SimpleAbstractClassImpl extends SimpleAbstractClass{

    public void getStatus(){
        System.out.println("Inside SimpleAbstractClassImpl getStatus():");

    }
}

public class AbstractDemo{
    public  static void main(String[] args){

        SimpleAbstractClass obj = new SimpleAbstractClassImpl();
        obj.show();
        obj.getStatus();
    }
}