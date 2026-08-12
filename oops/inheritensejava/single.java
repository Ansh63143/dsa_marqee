package inheritensejava;

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class single {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   // Parent method
        d.bark();  // Child method
    }
}