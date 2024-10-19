package JavaFeatures;

/*
Record is a special kind of class.

Use as alternative to data carrier classes (classes whose purpose is just to send and receive data, class which only holds data)

Records are particularly useful for creating simple, immutable data carriers.
They reduce boilerplate code, making the codebase cleaner and more readable. Use records when you need to create classes
that primarily store data and do not require mutable state or complex behavior.

By utilizing records, you can significantly reduce the amount of boilerplate code in your application, making it easier
to maintain and understand.


 */


import java.util.Objects;

class Employee{
    private final int id; // immutable variable, not going to change
    private final String name;

    public Employee(int id, String name){
        this.id =  id;
        this.name = name;
    }

    // need getters for fetching values
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

// instead of using above class we can use below record
record EmployeeUsingRecord(int id, String name) {} // all variables (id , name) are private and final because its immutable data



public class RecordClassesDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "abhishek");
        System.out.println(e1); // needs toString method() elemented
        Employee e2 =  new Employee(1, "abhishek");

//        e1.id      // private variable cant be access

        System.out.println(e1.equals(e2));  // returns true after we override equals and hashcode method

        System.out.println("----------------------------------");
        EmployeeUsingRecord record1 = new EmployeeUsingRecord(10, "siri"); // works without us explicitly defining constructor in record
        EmployeeUsingRecord record2 = new EmployeeUsingRecord(10, "siri");

        System.out.println(record1); // works without us explicitly defining toString

        System.out.println(record1.equals(record2)); // workout without us explicitly overriding equals method

        // record1.id   record variables are private final by default
    }
}
