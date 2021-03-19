public class BillLine {

    private Item item;
    private int amount;
    private double total;

    public BillLine(Item item, int amount) {
        this.item = item;
        this.amount = amount;

    }

    public int getAmount() {
        return amount;
    }

    public double getTotal() {
        return total = item.getItemPrice() * getAmount();
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String toString() {
        return item + "item amount :" + amount;

    }
}
