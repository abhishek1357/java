package BasicJava;


interface Computer{
    void code();
}

class Laptop implements Computer{

    public void code(){
        System.out.println("code compile run...");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code compile run...");
    }
}

class Developer{

    public void devApp(Computer comp){
        comp.code();
    }
}
public class NeedForInterface {

    public static void main(String[] args){
        Developer developer =  new Developer();
        Computer computer = new Desktop();
        developer.devApp(computer);

        Computer computer1 = new Laptop();
        developer.devApp(computer1);
    }
}
