package Java.Level_03;

public class Exception_02 {
    
}

class InsufficientFundsException extends Exception{
    private double amount;
    public InsufficientFundsException(double amount){
        this.amount=amount;
    }
    public double getAmount(){
        return amount;
    }
}

class CheckingAccount{
    private double balance;
    private int number;
    public CheckingAccount(int number){
        this.number=number;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount<=balance){
            balance-=amount;
        }else{
            double needs=amount-balance;
            throw new InsufficientFundsException(needs);
        }
    }
}