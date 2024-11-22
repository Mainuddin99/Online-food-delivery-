// Class for Food Item
class FoodItem {
    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayItem() {
        System.out.println("Food: " + name + ", Price: $" + price);
    }
}

// Main class
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem pizza = new FoodItem("Pizza", 12.99);
        FoodItem burger = new FoodItem("Burger", 8.99);

        System.out.println("Available Food Items:");
        pizza.displayItem();
        burger.displayItem();
    }
}
