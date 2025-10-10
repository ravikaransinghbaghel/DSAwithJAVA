package oops;

public class inheritance {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.bark();
        d1.eat();

        System.out.println("-------------------");
        jarman j1 = new jarman();
        j1.bark();
        j1.eat();
        j1.weep();

        System.out.println("-------------------");
        loin l1 = new loin();
        l1.run();
        l1.eat();
        
        System.out.println("-------------------");
        tiger t1 = new tiger();
        t1.jump();
        t1.run();
        t1.eat();

    }
}

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

// single inheritance
// animal --> dog
class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }

}

// multiple level inheritance
// animal --> dog --> jarman
class jarman extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
}

// hierarchical inheritance
// animal --> dog
// animal --> loin
class loin extends Animal {
    void run() {
        System.out.println("running...");
    }
}

// hybrid inheritance
// animal --> dog --> jarman
// animal --> loin --> tiger
class tiger extends loin {
    void jump() {
        System.out.println("jumping...");
    }
}