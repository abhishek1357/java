package BasicJava;


class Mobile
{
    String brand;
    int price;
    static String name;
    String model;

    static {
        System.out.println("Inside static block...");
        name="QWER";

    }

    public Mobile(String model){
        this.model = model;
        System.out.println("Inside mobile....");
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public static void staticMehothod1(){
        System.out.println("Inside static method");
    }

    public String getName(){
        return name;
    }
}
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
//        Class.forName("Mobile");
        Mobile m1 = new Mobile("X10");
        m1.brand = "nokia";
        m1.price = 1200;
        System.out.println(m1.getName());
        Mobile m2 = new Mobile("X10");
        Mobile m3 = new Mobile("X10");
        Mobile m4 = new Mobile("X10");

        Mobile.staticMehothod1();
    }
}
