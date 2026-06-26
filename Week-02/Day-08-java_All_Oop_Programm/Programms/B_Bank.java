
import java.util.Scanner;

public class B_Bank {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to the jyoti Bank");
        BankAccount bankAccount = new BankAccount(123456,"Harshal",900);
        bankAccount.display();
        bankAccount.deposit(100);
      String result = bankAccount.withDraw();
        System.out.println(result);
    }
}
class BankAccount
{

    Scanner scanner = new Scanner(System.in);
    int user_ID;

    String user_Name;

    double bank_Balance;

    public BankAccount(int user_ID,String user_Name,double bank_Balance)
    {
        this.user_ID=user_ID;
        this.user_Name=user_Name;
        this.bank_Balance=bank_Balance;
    }

    public  void deposit(int Deposit)
    {
        double temp = bank_Balance;

        bank_Balance = bank_Balance+Deposit;
        System.out.println("Your previous bank balance is "+ temp + "After succefully deposit" + bank_Balance);
    }

    public String withDraw()
    {
        System.out.println("Enter the amout which you want to withdraw");
        double withdrwaa = scanner.nextDouble();

        if(withdrwaa>0 && bank_Balance>=withdrwaa)
        {
            bank_Balance = bank_Balance-withdrwaa;
            return "Please wait, cash is being dispensed from ATM. Remaining balance: "
                    + bank_Balance;
        }return "Insufficient Balance";
    }

    public void display()
    {
        System.out.println("your user id is--->"+ user_ID);
        System.out.println("your user name is---->"+user_Name);
        System.out.println("your current bank balance is--->"+bank_Balance);

    }

}
