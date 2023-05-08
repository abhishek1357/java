package JavaFeatures;
/*
* A functional interface can contain default and static methods which do have an implementation,
* in addition to the single unimplemented method
* */
@java.lang.FunctionalInterface  // optional informative annotation
public interface FunctionalInterfaceDemo {
    // An abstract function
    void abstractFun(int x);

    // A non-abstract (or default) function
    default void normalFun()
    {
        System.out.println("Hello");
    }
}
