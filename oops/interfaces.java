package oops;

public class interfaces {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.print();    
        obj.show();
    }
}

// interface
interface printable{
    void print();
}

interface showable{
    void show();
}

class MyClass implements printable, showable{
    public void print(){
        System.out.println("Hello, World!");
    }
    public void show(){
        System.out.println("Showing something");
    }
}   
