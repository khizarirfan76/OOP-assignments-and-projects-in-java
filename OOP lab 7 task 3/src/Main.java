public class Main
{
    public static void main(String[] args) {

        checkingAccount acc0= new checkingAccount("zartash",100000,25000);
        savingsAccount acc1= new savingsAccount("danish",23000,12);
        certificateOfdeposit acc2= new certificateOfdeposit("ahmad",1200,"06-12-2026");

        acc0.withdraw(200);
        acc1.deposit(20333);
        acc2.setMaturityDate("12-02-2024");

        bankAccount acc3=acc0;
        bankAccount acc4=acc1;
        bankAccount acc5=acc2;

        System.out.println(acc3);
        System.out.println("------------");
        System.out.println(acc4);
        System.out.println("------------");
        System.out.println(acc5);
        System.out.println("------------");
    }
}

