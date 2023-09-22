//https://github.com/hadjitejuco/JAVATN23NEW
//MASTER Branch -> SRC Folder 
//Enter amount to deposit
//Current Balance
//Withdraw amount
//Update the Balance


/*  
    CLASS DIAGRAM

    Bank Account

    -balance: double

    +getBalance()
    -setBalance(double balance)
    +deposit(double amount)
    +withdraw(double amount)
*/

public class BankAccount {
    private double balance;
    
    //getter for our balance
    public double getBalance(){
        return balance;
    }
    
    //private modify deposit/withdrawal
    private void setBalance(double balance){
        this.balance =  balance;   
    }
    
    //deposit method
    public void deposit(double amount){
        if (amount > 0) {
            setBalance(getBalance()+amount);
        }
    }
    
    //withdraw method
    public void withdraw(double amount){
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
        }else{
            System.out.println("Withdrawal amount is invalid or exceeds balance");
        }
    }
}
 