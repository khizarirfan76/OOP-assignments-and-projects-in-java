import java.util.*;

class Main
{
    public static void main(String[] args) {

        bankAccount b=new bankAccount("khizar","1122",20000);

        b.deposit(2000);
        try {
            b.withdraw(25000);
        }
        catch(InsufficientFundsException e)
        {
            System.out.println("error: "+e.getMessage());
        }
    }
}