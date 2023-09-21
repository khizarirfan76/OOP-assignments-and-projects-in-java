public class checkingAccount extends bankAccount{
    private double limit;
    public void getLimit()
    {
        System.out.println(limit);
    }
    public void setLimit(double limit)
    {
        this.limit=limit;
    }
    @Override
    public void withdraw(double amount)
    {
        if(amount<balance && amount<limit)
        {
            setBalance(balance-amount);
        }
        else {
            System.out.println("insufficient funds");
        }
    }
    public checkingAccount(String account,double balance,double limit)
    {
        super(account,balance);
        setLimit(limit);
    }

}
