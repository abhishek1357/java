package BasicJava;

class A{

    public A(){
        System.out.println("inside A");
    }

    public A(int val){
        System.out.println("Inside A int");
    }
}

class B extends A{
    public B(){

//        super(); present by default
        System.out.println("Inside B");

    }

    public B(int val){

        super(val);
        System.out.println("Inside B int");
    }
}

class Runner{
    public static void main(String[] args){
        B b = new B(5);
    }


}