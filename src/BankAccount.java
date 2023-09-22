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
import java.util.Scanner;
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
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();
        
        System.out.println("Enter deposit amount");
        double depositAmount = scanner.nextDouble();
        
        account.deposit(depositAmount);
        
        System.out.println("Current balance is "+account.getBalance());
        
        
        System.out.println("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        
        System.out.println("Current balance is "+account.getBalance());
        scanner.close();
        
    }
    
}
