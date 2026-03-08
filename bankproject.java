import java.util.*;

abstract class Account
{
    private String accountNumber;
    private String holdername;
    protected double balance;

    public Account(String accountNumber, String holderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;

    }

    public String getAccountNumber()
    {
        return accountNumber;
    }
    public String getHolderName();
    {
        return holderName;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    
}
class SavingsAccount extends Account
{
    public SavingsAccount(String accountNumber,String holderName,double balance)
    {
        super(accountNumber, holderName, balance);
    }

    @Override
    void deposit(double amount)
    {
        balance += amount;
    }

    @Override
    void withdraw(double amount)
    {
        if(amount<= balance) balance -= amount;
        else System.out.println("Insufficient balance");
    }
}

class CurrectAccount extends Account
{
    public CurrectAccount(String accountNumber, String holderName, double balance)
    {
        super(accountNumber, holdername, balance);
    }

    @Override
    void deposit(double amount)
    {
        balance += amount;
    }

    @Override
    void withdraw(double amount)
    {
        if(amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance");
    }
}
class Bank
{
    private Map<String, Account> accounts = new HashMap<>();

    public void createAccount(Account acc)
    {
    }
}