//this program exhibits singleton pattern. 
//All your clothes will share the same wardrobe space
//So create a single instance of wardrobe and continue reusing that everytime you want to add clothes
import java.util.ArrayList;
import java.util.List;;

class Clothes {
    private String type;

    public Clothes(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
class Wardrobe {
    private static Wardrobe wardrobe; //this will be reused throughout, part of the class and not a particular object
    private List<Clothes> clothing; //list to store all clothes

    private Wardrobe() { //private constructor so that only the class can call this
        clothing = new ArrayList<>();
    }

    public static Wardrobe getInstance() { //since we have a private constructor, we need a method which can call it
        if (wardrobe == null) {
            wardrobe = new Wardrobe(); //if it has not been initialized till now, initialize it
        }
        return wardrobe;
    }

    public void addClothing(Clothes c) {
        clothing.add(c);
    }

    public void removeClothing(Clothes c) {
        clothing.remove(c);
    }

    public void displayClothing() {
        for (Clothes c : clothing) {
            System.out.println(c.getType());
        }
    }
}

public class singleton {
    public static void main(String[] args) {
        Wardrobe mywardrobe = Wardrobe.getInstance();
        
        Clothes c1 = new Clothes("red dress");
        Clothes c2 = new Clothes("black jeans");
        Clothes c3 = new Clothes("Blue shirt");

        mywardrobe.addClothing((c1));
        mywardrobe.addClothing((c2));
        mywardrobe.addClothing((c3));

        mywardrobe.displayClothing();
    }
}
