public class Transaction {
    String type;
    double amount;

    Transaction(String type, double amount){
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return type + ": " +  "amount: " + amount +" kr";
    }
}
