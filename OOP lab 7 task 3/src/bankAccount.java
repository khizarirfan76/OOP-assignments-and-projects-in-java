public class bankAccount
{
    protected String account;
    protected double balance;

    public void setAccount(String account)
    {
        this.account=account;
    }

    public void getAccount()
    {
        System.out.println(account);
    }
    public void getBalance()
    {
        System.out.println(balance);
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public void deposit(double amount)
    {
        balance = balance+amount;
        System.out.println("your new balance is "+balance);
    }
    public void withdraw(double amount)
    {
        if(balance>amount)
        {
            balance=balance-amount;
        }
        else {
            System.out.println("insufficient balance");
        }

    }
    public String toString()
    {
        return "balance="+balance+" account name="+account;
    }
    protected bankAccount(String account,double balance)
    {
        this.balance=balance;
        this.account=account;
    }
    protected bankAccount()
    {
        setAccount("null");
        setBalance(1111);
    }



}
