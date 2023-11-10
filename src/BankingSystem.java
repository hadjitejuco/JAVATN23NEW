
import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;
        
        while(true){
            System.out.println("\n=============Banking System=============");
            System.out.println("1. Create New Account ");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Print Transaction");
            System.out.println("6. Exit");
            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Account ID: ");
                    String accountID = scanner.next();
                    System.out.println("Enter Account Name: ");
                    String accountName = scanner.next();
                    account = new BankAccount(accountID, accountName, 0);
                    FileUtility.writeToFile("Account Created "+account.getAccountDetails());
                    break;
                case 2:
                    if (account == null){
                        System.out.println("No account found, please create an account first ");
                        break;
                    }
            
                    
                    System.out.println("Enter amout to deposit");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    FileUtility.writeToFile("Deposited "+depositAmount+ ": "+ account.getAccountDetails());
                    break;
                
                case 3:
                    if (account == null){
                        System.out.println("No account found, please create an account first ");
                        break;
                    }
                    System.out.println("Enter amount to withdraw");
                    double withdrawAmount = scanner.nextDouble();
                    if (account.withdraw(withdrawAmount)){
                        FileUtility.writeToFile("Withdraw "+withdrawAmount+ ": "+ account.getAccountDetails());

                    }else {
                        System.out.println("Insufficient Balance");
                    
                    }
                    break;
                    
                case 4:
                    if (account == null){
                        System.out.println("No account found, please create an account first ");
                        break;
                    }
                    System.out.println("Current Balance "+ account.getBalance());
                    break;
                case 5:
                    FileUtility.readFromFile();
                    break;
                case 6:
                    System.out.println("Bye");
                    scanner.close();
                    break;
                default:
                    System.err.println("Invalid option");
                     break;   
  
                     
            }

        }
    }
    
}
