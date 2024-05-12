package BasicJava;


class Abc{
    int age;
    class Xyz{
        public void show(){
            System.out.println("in Xyz: show()");
        }
    }

    static class Pqr{
        public void show(){
            System.out.println("in Pqr: show()");
        }
    }
}



public class InnerClassDemo {
    public static void main(String[] args){

//        Abc.Xyz inner_obj = new Abc.Xyz(); // this is wrong syntax

        Abc abc =  new Abc();
        Abc.Xyz inner_obj = abc.new Xyz(); // need object of outer class to create object of inner class
        inner_obj.show();

        Abc.Pqr inner_obj2 = new Abc.Pqr(); // we dont need outer class object if inner class is static
        inner_obj2.show();

    }
}
