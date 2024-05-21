package BasicJava;
/*
Annotations are supplements/info to compiler or runtime, sometimes we call meta-data
 */


class Az{

    public void eyeOfTheTiger(){
        System.out.println("Inside Az..");
    }
}

class Bz extends Az{

    @Override // if we make typo in method name, compiler will give error saying
    public void eyeOfTheTiger(){
        System.out.println("inside Bz");
    }
}


public class AnnotationsDemo {
    public static void main(String[] args) {
    Bz bz = new Bz();
    bz.eyeOfTheTiger();
    }
}
