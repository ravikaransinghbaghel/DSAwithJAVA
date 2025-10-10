package oops;

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        // s1.name2 = "ravi karan";
        Student s2 = new Student(20, "karan singh", new int[] { 80 });
        System.out.println("s2-> hii " + s2.name + ", age :" + s2.age + ", marks: " + s2.mark[0]);
        s1.mark[0] = 99;
        Student s3 = new Student(s1);
        System.out.println("s3-> hii " + s3.name + ", age :" + s3.age + ", marks: " + s3.mark[0]);

    }
}

class Student {
    protected int age;
    String name;
    int mark[] = { 89, 49, 68 };

    // non parameterized constructor
    Student() {
        age = 21;
        name = "ravi karan";
        System.out.println("s1-> hii " + name + ", age :" + age + ", marks: " + mark[0]);
    }

    // parameterized constructor
    Student(int age, String name, int mark[]) {
        this.mark = mark;
        this.age = age;
        this.name = name;

    }

    // copy constructor
    Student(Student s1) {
        this.age = s1.age;
        this.name = s1.name;
        // this.mark = s1.mark;
        for (int i = 0; i < s1.mark.length; i++) {
            this.mark[i] = s1.mark[i];
        }
    }
}
