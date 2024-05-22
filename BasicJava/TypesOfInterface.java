package BasicJava;


interface Normal{

    void show();

    int add(int a); // more than one method
}

@FunctionalInterface
interface FunctionalInt{

    int add(int a, int b); // only one method

}

interface MarkerInterfaceDemo{
    // has no methods, it is to update something to compiler
    // hey compiler please allow this - eg. hey compiler please allow serialization, so we use serializable marker interface
}

public class TypesOfInterface {
    public static void main(String[] args) {

    }
}
