package JavaFeatures;


@java.lang.FunctionalInterface
interface A
{
    void show();
}

//class B implements A{
//
//    public void show()
//    {
//        System.out.println("hiii");
//    }
//}


public class AnnonymousInner
{
    public static void main(String args[])
    {
        A obj = new A(){
            public void show()
            {
                System.out.println("hiii");
            }
        };
        obj.show();
    }
}



