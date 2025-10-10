package oops;

public class encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.student(20, "ravi karan");
        System.out.println("name: " + s1.getName() + ", age :" + s1.getAge());
    }
}

class Student {
    private int age;
    private String name;

    // constructor
    public void student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // getter and setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
