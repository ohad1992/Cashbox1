
import java.util.Scanner;

public class Start {

    static CashBox cash = new CashBox();

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        boolean run = true;
        while (run) {
            System.out.println(
                    "\n" + "Enter 1 for check balance in the cashbox" + "\n Enter 2 for start adding item to the list"
                            + "\nEnter 3 for the list of item "
                            + "\nEnter 4 for paymant"
                            + "\nEnter 5 for total cost" + "\n Enter 6 for exit");

            int answer = scan.nextInt();
            switch (answer) {


                case 1:
                    System.out.println("your balance in cashbox:" + cash.getBalance());
                    System.out.println("\n");


                case 2:
                    addItem();

                case 3:
                    System.out.println(cash.toString());
                    System.out.println("\n");
                case 4:
                    System.out.println("PLEASE ENTER AMOUNT OF PAYMENT");
                    double payment = scan.nextDouble();
                    System.out.println("your change is:" + cash.change(payment));

                case 5:
                    System.out.println(cash.getTotalOfPurchase());
                    System.out.println("\n");

                case 6:
                    run = false;
                    break;
            }

        }

    }


    private static void addItem() {

        boolean add = true;
        while (add) {
            Item item = new Item();
            System.out.println("Lets add item to your list");
            System.out.println("Enter the name of the item");
            item.setItemName(scan.next());
            System.out.println("Enter the price of the item");
            item.setItemPrice(scan.nextDouble());
            System.out.println("Enter the amount of the item");
            int amount = scan.nextInt();
            cash.addItem(item, amount);
            System.out.println("Enter 1 to add more or 3 to see you list ");
            if (!(scan.nextInt() == 1))
                add = false;
        }
        System.out.println("\n");
    }
}

