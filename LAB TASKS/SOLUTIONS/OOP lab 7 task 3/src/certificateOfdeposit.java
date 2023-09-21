public class certificateOfdeposit extends bankAccount {
    private String maturityDate;

    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }

    public void getMaturityDate() {
        System.out.println(maturityDate);
    }

    public certificateOfdeposit(String account, double balance, String maturityDate) {
        super(account, balance);
        this.maturityDate = maturityDate;
    }

}
