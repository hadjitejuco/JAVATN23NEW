import java.util.Scanner;
public class BankAccount2 {
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
