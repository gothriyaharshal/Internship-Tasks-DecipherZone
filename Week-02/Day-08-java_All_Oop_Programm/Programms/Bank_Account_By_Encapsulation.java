import java.util.Scanner;

class Bank_Account_By_Encapsulation
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);

 Bank_Details bd = new Bank_Details(100,"12345543");
  double result1 = bd.getbalance();
 System.out.println(result1);

 bd.deposit(100);
 bd.withdraw(50);

  double result = bd.getbalance();
 System.out.println(result);


}
}

class Bank_Details
{
 private double balance;
 private String accntNumber;


  Bank_Details(double balance , String accntNumber)
 {
  this.balance = balance;
  this.accntNumber = accntNumber;
 }

 public double getbalance()
 {
   return this.balance;
 }

 public String accntNumber()
 {
   return this.accntNumber;
  }
 
 public void deposit(double amount)
{
if(amount>0)
{
balance= balance+amount;
System.out.print("Amount deposited your current balance is---> "+ balance);

}
}

 public void withdraw(double amount)
 {
   if(amount>0 && this.balance>=amount)
   {
    balance = balance-amount;
    System.out.println("withdrwe succecsfully your current balance is"+balance);
     
}
 }
}