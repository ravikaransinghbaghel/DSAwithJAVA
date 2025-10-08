package oops;

public class basic {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.student(20, "ravi karan");
        System.out.println("name: " + s1.name + ", age :" + s1.age);
    }

}

class Student {

    protected int age;
    String name;
    int mark[] = new int[3];

    // constructor
    void student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}