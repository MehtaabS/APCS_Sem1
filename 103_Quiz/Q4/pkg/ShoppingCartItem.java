package pkg;

public class ShoppingCartItem {
    private String itemName;
    private double itemCost;
    private int quantity;

    public ShoppingCartItem() {
        itemName = "Nothing";
        itemCost = 0.0;
        quantity = 0;
    }

    public ShoppingCartItem(String itemName, double itemCost, int quantity) {
        this.itemName = itemName;
        this.itemCost = itemCost;
        this.quantity = quantity;
    }

    public void cartToString() {
        System.out.println("You have " + quantity + " of " + itemName + " for $" + itemCost + " each.");
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemCost() {
        return itemCost;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalCost() {
        return itemCost * quantity;
    }

    public double getTotalWithTax() {
        double tax=itemCost*0.12;
        double taxtotal=itemCost+tax;
        return taxtotal;
    }

    public double quantityToCostCalculator(int q) {
        return itemCost * q;
    }

    public boolean compareItemCost(ShoppingCartItem s ) {
        if (itemCost < s.itemCost) {
            return true;
        } 
        else {
            return false;
        }
    }

 

}
