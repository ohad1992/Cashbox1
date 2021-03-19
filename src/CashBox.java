import java.util.ArrayList;

public class CashBox {

    private double balance;

    ArrayList<BillLine> cashbox;

    public CashBox() {
        cashbox = new ArrayList<BillLine>();
    }

    public CashBox(double balance) {
        this.balance = balance;
    }

    // adding item to the list
    public void addItem(Item item, int amount) {
        BillLine billLine = new BillLine(item, amount);
        cashbox.add(billLine);
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < cashbox.size(); i++)
            str += cashbox.get(i).toString();
        return str;
    }

    // get the total of purchase of 1 customer
    public double getTotalOfPurchase() {
        double total = 0;
        for (int i = 0; i < cashbox.size(); i++) {
            total += cashbox.get(i).getTotal();
        }
        return total;
    }

    //get balance in cashbox
    public double getBalance() {
        return balance;
    }

    //calculate change to a customer
    public double change(double payment) {
        double sumOfPurchase = getTotalOfPurchase();
        double change = payment - sumOfPurchase;
        cashbox.clear();
        balance += sumOfPurchase;
        return change;

    }
}
