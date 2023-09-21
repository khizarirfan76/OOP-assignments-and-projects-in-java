public class savingsAccount extends bankAccount {
    private double interestRate;
    public void getInterestRate()
    {
        System.out.println(interestRate);
    }
    public void setInterestRate(double interestRate)
    {
        interestRate=interestRate/100;//makes sure keh jab user 12 likhe to 12 percent to
        //variable mein 0.12 hi store ho
        this.interestRate=interestRate;
    }
    public savingsAccount(String account,double balance,double interestRate)
    {
        super(account,balance);
        setInterestRate(interestRate);
    }

}
