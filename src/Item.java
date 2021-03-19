public class Item {

    private double itemPrice;
    private String itemName;

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return " Price= " + itemPrice + ",  item Name ='" + itemName + '\'';

    }
}
