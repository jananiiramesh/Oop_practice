//grandparent class
class Animal {
    void eat() {
        System.out.println("This animal is eating");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("This animal is walking");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog says woof!");
    }
}
public class multilevelInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.walk();
        dog.bark();
    }
}
