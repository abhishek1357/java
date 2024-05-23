package BasicJava.CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Collections is a class, Collection is an interface

public class SortingDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(132);
        nums.add(328);
        nums.add(2000);
        nums.add(242);


        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                // a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.

                if (i%10 > j%10)// sorting based on last digit. here 0, 2, 2, 8
                    return 1;
                else if (i%10 < j%10)
                    return -1;
                else
                    return 0;

            }
        };

        Collections.sort(nums, comparator);
        System.out.println(nums);

        Student s1 = new Student(10, "Singh");
        Student s2 = new Student(20, "Patel");
        Student s3 = new Student(30, "Rao");
        Student s4 = new Student(40, "Jain");

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        Collections.sort(students); // sorting without comparator because we made Student object comparable
        System.out.println(students);
    }
}


class Student implements Comparable<Student>{

    private  int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student that) {
        return this.age < that.age? 1 : -1; // sort in reverse order of age1
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
