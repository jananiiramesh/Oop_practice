interface singing {
    void sing();
}

class Human implements singing {
    public void sing() {
        System.out.println("Humans(many) can sing!");
    }
}

class Bird implements singing {
    public void sing() {
        System.out.println("Birds can sing too!");
    }
}
public class hierarchicalInheritance {
    public static void main(String[] args) {
        Human human = new Human();
        Bird bird = new Bird();
        human.sing();
        bird.sing();
    }
}
