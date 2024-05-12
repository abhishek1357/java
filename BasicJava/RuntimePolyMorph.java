package BasicJava;



class AA{

    public void show(){
        System.out.println("in AA show");
    }
}

class BB extends AA{
    public void show(){
        System.out.println("in BB show");
    }

    public void show2(){
        System.out.println("in BB show2");
    }
}

public class RuntimePolyMorph {
    public static void main(String[] args){
        AA obj = new AA();
        obj.show();

        AA obj1 = (AA) new BB(); // here type casting is redundant, it happens explicitly
        obj1.show(); // prints in BB show, calls B class method

       // obj1.show2(); // This doesnt work; as reference type is A, it has no idea about show2()

        BB obj_b = (BB) obj1;
        obj_b.show2(); // works after type casting


    }
}
