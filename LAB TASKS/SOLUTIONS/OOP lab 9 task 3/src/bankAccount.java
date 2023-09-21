public class bankAccount
{
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public bankAccount(String accountHolder,String accountNumber,double balance)
    {
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;

    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount)
    {
        balance+=amount;
    }
    public void withdraw(double amount) throws InsufficientFundsException
    {
        if(amount>balance)
        {
            throw new InsufficientFundsException("insufficient funds");
        }
        balance-=amount;
    }
}
