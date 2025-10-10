package oops;

public class abstraction {
    public static void main(String[] args) {

        // Bike1 b= new Bike1(); // we cannot create the object of abstract class
        Bike1 b1 = new Honda1();
        b1.run();
        b1.changeGear();
    }
}

// abstract class
abstract class Bike1{
    abstract void run(); // abstract method
    void changeGear() {
        System.out.println("gear changed");
    }
}
class Honda1 extends Bike1{
    void run() {
        // implementation of abstract method 
        System.out.println("running safely");
    }
}

