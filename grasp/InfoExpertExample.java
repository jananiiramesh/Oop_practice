//information expert: bill asks item to tell its price, because item knows best about its own price
// "Ask the expert for information"
import java.util.List;
import java.util.ArrayList;;

class Item {
    String Name;
    private int price;

    public Item(String Name,int price) {
        this.Name = Name;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return price;
    }
}

class Bill {
    private List<Item> items = new ArrayList<>();

    int billNo;
    public Bill(int billNo) {
        this.billNo = billNo;
    }

    public void addToBill(String name, int price) { //you can directly pass an item as parameter as well
        Item item = new Item(name, price);
        items.add(item);
    }

    public int totalAmount() {
        int total = 0;
        for (Item item : items) {
            total = total + item.getPrice();
        }
        return total;
    }
}
public class InfoExpertExample {
    public static void main(String[] args) {
        Bill bill = new Bill(1);
        bill.addToBill("toothpaste", 79);
        bill.addToBill("Body Wash", 499);
        bill.addToBill("Cup noodles", 249);
        int totalAmount = bill.totalAmount();
        System.out.println(totalAmount);
    }
}
