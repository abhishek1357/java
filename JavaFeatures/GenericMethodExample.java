package JavaFeatures;

public class GenericMethodExample {

    // A generic method that prints and returns the input parameter
    public <T> T printAndReturn(T input) {
        System.out.println(input);
        return input;
    }

    public static void main(String[] args) {
        GenericMethodExample example = new GenericMethodExample();

        // Call the generic method with different types
        String result1 = example.printAndReturn("Hello, World!");
        Integer result2 = example.printAndReturn(123);
        Double result3 = example.printAndReturn(456.78);

        // Print the results
        System.out.println("Returned: " + result1);
        System.out.println("Returned: " + result2);
        System.out.println("Returned: " + result3);
    }
}
