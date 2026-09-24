import java.util.ArrayList;

public class BankAccount {
    String owner;
    double balance;
    ArrayList<Transaction> transactions;

    BankAccount(String owner, double startBalance){
        this.owner = owner;
        this.balance = startBalance;
        this.transactions = new ArrayList<>();
        transactions.add(new Transaction("deposit", startBalance));
    }

    void deposit(double amount){
        if (amount > 0){
            balance += amount;
            transactions.add(new Transaction("deposit", amount));
            System.out.println("Indsatte" + amount + " kr");
        }

    }

    void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            transactions.add(new Transaction("withdraw", amount));
            System.out.println("Hævede " + amount + " kr");
        }
    }

    void printTransactionHistory(){
        System.out.println("Transaction History for " + owner + ": ");
        for (Transaction t : transactions){
            System.out.println(t);
        }
    }

    double getBalance(){
        return balance;
    }




}
