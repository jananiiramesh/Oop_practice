//creator principle of GRASP
//let the class that uses another class closely create an instance (or deal with) that class
import java.util.ArrayList;
import java.util.List;

class Toppings {
    private String name;

    public Toppings(String Name) {
        this.name = Name;
    }

    public String getName() {
        return name;
    }
}

class Pizza {
    private List<Toppings> toppings = new ArrayList<>();

    int orderNo;
    public Pizza(int orderNo) {
        this.orderNo = orderNo;
    }

    public void addTopping(String name) {
        Toppings topping = new Toppings(name);  //Pizza uses Toppings so its best if Pizza has authority to create new Toppings
        toppings.add(topping);
    }

    public void showToppings() {
        System.out.println("Order no: " + this.orderNo + "\n");
        for(Toppings topping : toppings) {
            System.out.println(topping.getName() + "\n");
        }
    }
}
public class CreatorExample {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(101);
        pizza.addTopping("Cheese");
        pizza.addTopping("Olives");
        pizza.addTopping("Jalapenos");

        pizza.showToppings();
    }
}
