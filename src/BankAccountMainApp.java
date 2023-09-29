

import java.util.Scanner;

public class BankAccountMainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Account holder name
        System.out.println("Please enter account holders name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        
        //create object
        BankAccountE account = new BankAccountE(name, initialBalance);
        
        while (true) {
            System.out.println("\n---MENU---");
            System.out.println("1. Add transaction");
            System.out.println("2. Display transaction");
            System.out.println("3. Check balance");
            System.out.println("4. Delete transaction");
            System.out.println("5. Modify transaction");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter transaction amount (negative for withdrawal, positive for deposit");
                    double amount = scanner.nextDouble();
                    account.addTransaction(amount);
                    break;
                case 2:
                    System.out.println("Transction for "+name+ ":");
                    int index = 0;
                    for(double transaction : account.getTransactions()){
                        System.out.println(index++ + ". "+transaction);
                    }
                    break;
                case 3:
                    System.out.println("Curent balance "+account.getCurrentBalance());
                    break;
//                case 4:
//                    System.out.println("Enter the index of the transaction to delete: ");
//                    int deleteIndex = scanner.nextInt();
//                    //method to delete the index
//                    break;
//                case 5:
//                    System.out.println("Enter the index of the transction to modify");
//                    int modifyIndex = scanner.nextInt();
//                    //method to modify
//                    break;
                case 6:
                    System.out.println("Goodbye!!!!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again...");
            }
        }
    }
}
