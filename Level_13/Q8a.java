import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private String atmCardNumber;
    private double accountBalance;
    private int atmPin;

    public BankAccount(String accountHolder, String accountNumber, String atmCardNumber, double accountBalance, int atmPin) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.atmCardNumber = atmCardNumber;
        this.accountBalance = accountBalance;
        this.atmPin = atmPin;
    }

    public String toString() {
        return "Account Holder: " + accountHolder + "\n" +
               "Account Number: " + accountNumber + "\n" +
               "ATM Card Number: " + atmCardNumber + "\n" +
               "Account Balance: $" + accountBalance + "\n" +
               "ATM PIN: " + atmPin;
    }

    public void writeToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Q8a{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("John Doe", "123456789", "987654321", 1000.0, 1234);
        BankAccount account2 = new BankAccount("Jane Doe", "987654321", "123456789", 1500.0, 5678);

        account1.writeToFile("account1.txt");
        account2.writeToFile("account2.txt");
    }
}