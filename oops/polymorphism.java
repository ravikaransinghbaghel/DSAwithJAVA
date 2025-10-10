package oops;

public class polymorphism {
    public static void main(String[] args) {

        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(11, 11, 11));
        System.out.println(Adder.add(11.5f, 11.5f));

        Bike b1 = new Bike();
        b1.run();

        Bike b2 = new Splendor();
        b2.run();

        Bike b3 = new Yamaha();
        b3.run();

    }
}

// compile time polymorphism(static polymorphism)
// method overloading
class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static float add(float a, float b) {
        return a + b;
    }
}

// runtime polymorphism(dynamic polymorphism)
// method overriding
class Bike {
    void run() {
        System.out.println("running...");
    }
}

class Splendor extends Bike {
    void run() {
        System.out.println("running safely with 60km");
    }
}

class Yamaha extends Bike {
    void run() {
        System.out.println("running fastly with 100km");
    }
}
