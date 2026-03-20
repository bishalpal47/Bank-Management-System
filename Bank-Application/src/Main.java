import service.BankService;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        BankService service = new BankService();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n===========================================");
            System.out.println("\t\t\t\tGG BANK");
            System.out.println("===========================================");
            System.out.println("Welcome!\nChoose one of the following options : ");
            System.out.println("1. Create new bank account");
            System.out.println("2. Close account");
            System.out.println("3. Withdraw funds");
            System.out.println("4. Deposit funds");
            System.out.println("5. Transfer funds to another account");
            System.out.println("6. View transaction history");
            System.out.println("7. View bank account details");
            System.out.println("8. Update account holder's details");
            System.out.println("9. EXIT");
            System.out.println("===========================================");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            System.out.println("===========================================");
            sc.nextLine();
            switch(choice) {
                case 1:
                    System.out.println("For creating a bank account, please provide the following details of bank account holder: ");
                    System.out.print("First name : ");
                    String fname = sc.nextLine();
                    System.out.print("Last name : ");
                    String lname = sc.nextLine();
                    System.out.print("email-id : ");
                    String email = sc.nextLine();
                    System.out.print("Phone number : ");
                    String phoneNumber = sc.nextLine();
                    System.out.print("Address : ");
                    String address = sc.nextLine();
                    System.out.print("Aadhar number : ");
                    long adharNumber = sc.nextLong();
                    sc.nextLine();
                    System.out.print("PAN number : ");
                    String panNumber = sc.nextLine();
                    service.createAccount(fname, lname, email, phoneNumber, address, adharNumber, panNumber);
                    break;
                case 2:
                    System.out.print("Enter your account number : ");
                    long accNumber = sc.nextLong();
                    service.closeAccount(accNumber);
                    break;
                case 3:
                    System.out.print("Enter your account number : ");
                    accNumber = sc.nextLong();
                    System.out.print("Enter amount : ");
                    double amount = sc.nextDouble();
                    service.withdraw(accNumber, amount);
                    break;
                case 4:break;
                case 5:
                    System.out.print("Enter your account number : ");
                    accNumber = sc.nextLong();
                    System.out.print("Enter receiver's account number : ");
                    long recAccountNumber = sc.nextLong();
                    System.out.print("Enter amount : ");
                    amount = sc.nextDouble();
                    service.transfer(accNumber, recAccountNumber, amount);
                    break;
                case 6:break;
                case 7:break;
                case 8:break;
                case 9:
                    System.out.println("Thank you for visiting GG Bank!!\nHave a wonderful day ahead!");
                    System.out.println("===========================================");
                    break;
                default:  System.out.println("Invalid option selected.\nKindly choose a valid option again.");
            }
        } while(choice != 9);
    }
}
