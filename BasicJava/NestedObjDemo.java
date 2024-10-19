package BasicJava;

public class NestedObjDemo {
    public static void main(String[] args) {
        NestedObjParent nestedObjParent = new NestedObjParent();
        nestedObjParent.setName("Parent");
        nestedObjParent.setId(1);

        NestedObjChild nestedObjChild = new NestedObjChild();
        nestedObjChild.setName("Child");
        nestedObjChild.setNum(2);

        nestedObjParent.setNestedObjChild(nestedObjChild);

        System.out.println("Parent Name: " + nestedObjParent.getName());
        System.out.println("Parent Id: " + nestedObjParent.getId());
        System.out.println("Child Name: " + nestedObjParent.getNestedObjChild().getName());
        System.out.println("Child Num: " + nestedObjParent.getNestedObjChild().getNum());

        NestedObjDemo demo = new NestedObjDemo();
        demo.check(nestedObjParent);
    }

    private void  check(NestedObjParent nestedObjParent) {

        NestedObjChild nestedObjChild = nestedObjParent.getNestedObjChild();

        System.out.println(nestedObjParent.getNestedObjChild().hashCode());
        System.out.println(nestedObjChild.hashCode());

    }

}
