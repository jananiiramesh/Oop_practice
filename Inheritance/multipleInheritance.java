interface singing {
    void sing();
}

interface dancing {
    void dance();
}

class Human implements singing, dancing {

    public void sing() {
        System.out.println("Human can sing");
    }

    public void dance() {
        System.out.println("Human can dance");
    }
}
public class multipleInheritance {
    public static void main(String[] args) {
        Human human = new Human();
        human.sing();
        human.dance();
    }
}
