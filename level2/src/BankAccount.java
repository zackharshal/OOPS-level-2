import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private int balance;
    public BankAccount(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("This account has "+balance+" rupees");
    }
    public void depositMoney(int amount){
        balance += amount;
        System.out.println("This account has "+balance+" rupees");
    }
    public void withdrawMoney(int amount){
        balance -= amount;
        System.out.println("This account has "+balance+" rupees");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your account number: ");
        int accNo = scanner.nextInt();
        System.out.println("Enter your balance: ");
        int balance = scanner.nextInt();
        BankAccount account1 = new BankAccount(accNo,balance);
        account1.depositMoney(1230);
        account1.withdrawMoney(1230);
    }
}
