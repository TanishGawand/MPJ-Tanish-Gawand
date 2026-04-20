package Bank;
import java.io.FileWriter;
import java.util.Scanner;

class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String msg) {
        super(msg);
    }
}

class Customer {
    int cid;
    String cname;
    double amount;

    Customer(int cid, String cname, double amount) throws Exception {
        if (cid < 1 || cid > 20)
            throw new Exception("Invalid ID");
        if (amount < 1000)
            throw new MinimumBalanceException("Min balance 1000");
        this.cid = cid;
        this.cname = cname;
        this.amount = amount;
    }

    void withdraw(double w) throws Exception {
        if (w <= 0)
            throw new Exception("Invalid amount");
        if (w > amount)
            throw new Exception("Not enough balance");
        amount -= w;
    }

    void show() {
        System.out.println(cid + " " + cname + " " + amount);
    }
}

public class BankSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter amount: ");
            double amt = sc.nextDouble();

            Customer c = new Customer(id, name, amt);

            System.out.print("Withdraw: ");
            double w = sc.nextDouble();

            c.withdraw(w);
            c.show();

            FileWriter fw = new FileWriter("customer.txt", true);
            fw.write(c.cid + " " + c.cname + " " + c.amount + "\n");
            fw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}