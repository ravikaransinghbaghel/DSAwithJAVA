package oops;

public class keywords {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 101;
        s1.name = "John";
        Student.college = "ABC College";
        // OR
        // s1.college = "ABC College"; // accessing static variable using object

        Student s2 = new Student();
        s2.rollno = 102;
        s2.name = "Doe";

        Student s3 = new Student();
        s3.rollno = 103;
        s3.name = "Smith";
        System.out.println("for s1: " + s1.rollno + " " + s1.name + " " + Student.college);
        System.out.println("for s2: " + s2.rollno + " " + s2.name + " " + Student.college);
        System.out.println("for s3: " + s3.rollno + " " + s3.name + " " + Student.college);

        System.out.println("-------------------");

        Dog d = new Dog();
        d.work();

    }
}

// static keyword
class Student {
    int rollno;
    String name;
    static String college; // static variable

}

// super keyword
class Animal {
    void eat() {
        System.out.println("animal eating...");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("dog eating bread...");
    }

    void bark() {
        System.out.println("dog barking...");
    }

    void work() {
        super.eat(); // calling parent class method
        bark();
    }
}
