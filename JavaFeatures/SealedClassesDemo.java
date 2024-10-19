package JavaFeatures;

/*
Sealed classes allow you to restrict which classes or interfaces can extend or implement them.
This is useful for creating a controlled and more predictable inheritance hierarchy.

sealed is keyword

something between abstract class (should be inherited) and final class(can not be inherited)

 */

sealed class SealedClassA permits NormalA, NormalC{

}

//final class NormalA {     // The permitted class have to extend the sealed class
//
//}

//class NormalA extends  SealedClassA{ // The permitted class should be either sealed, non-sealed or final
//
//}


final  class NormalA extends  SealedClassA{


}

//final class NormalB extends SealedClassA{ // NormalB class is not allowed to inherit
//
//}

non-sealed  class NormalC extends SealedClassA{ // we can make subclasses non-sealed which can be extended by some other class

}

class NormalD extends  NormalC{

}

// for interfaces:

sealed interface SealedIntA permits NormalIntA{

}

// sub interface should be either sealed or non-sealed (here there is no final coz interface cant be final)
non-sealed interface NormalIntA extends SealedIntA{

}


public class SealedClassesDemo {
    public static void main(String[] args) {

    }
}
