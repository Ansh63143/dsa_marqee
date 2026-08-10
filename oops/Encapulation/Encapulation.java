import java.util.*;
class BankAcc{
    private double balance;

    public void setBalance(double balance){ // setter method 
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance(){ // getter method encapulation
        return balance;
    }
}

public class Encapulation{
    public static void main(String[] args) {
        BankAcc acc = new BankAcc();
        acc.setBalance(10000.00);
        System.out.println(acc.getBalance());
        acc.deposit(5000);
        System.out.println(acc.getBalance());
        acc.withdraw(4000);
        System.out.println(acc.getBalance());
    }
}