
public class BankAccountE {
    //variables
    private String accountHolder;
    private double[] transactions;
    
    //constructor
    public BankAccountE(String accountHolder, double initialBalance){
        this.accountHolder = accountHolder;
        this.transactions = new double[]{initialBalance};
    }
    
    public void addTransaction(double amount){
        double[] newTranscations = new double[transactions.length+1];
        System.arraycopy(transactions, 0, newTranscations, 0, transactions.length);
        newTranscations[transactions.length]=amount;
        transactions = newTranscations;
    }
   
    public double getCurrentBalance(){
        double balance = 0;
        for (double transaction:transactions) {
           balance += transaction;
        }
        return balance;
    }
    
    public double[] getTransactions(){
        return transactions.clone();
    }
//    deleteTransaction(){}
//    modifyTransaction(){}

}
