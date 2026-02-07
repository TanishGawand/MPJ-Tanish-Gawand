package Bank;
import java.io.FileWriter;
import java.util.Scanner;

class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String message) {
        super(message);
    }
}

class Customer {
    int cid;
    String cname;
    double amount;

    public Customer(int cid, String cname, double amount) throws MinimumBalanceException {
        if (amount < 1000)
            throw new MinimumBalanceException("Account must have minimum Rs.1000");
        this.cid = cid;
        this.cname = cname;
        this.amount = amount;
    }

    public void withdraw(double w_amt) throws Exception {
        if (w_amt <= 0)
            throw new Exception("Withdrawal amount must be positive");
        if (w_amt > amount)
            throw new Exception("Insufficient balance");
        amount -= w_amt;
    }

    public void display() {
        System.out.println("\nCustomer ID: " + cid);
        System.out.println("Name: " + cname);
        System.out.println("Balance: " + amount);
    }
}

public class BankSystem {
    public static void main(String[] args) {

        try {
            Customer c = new Customer(1, "Tanish", 5000);
            c.withdraw(2000);
            c.display();

            FileWriter fw = new FileWriter("customer.txt");
            fw.write(c.cid + " " + c.cname + " " + c.amount);
            fw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
