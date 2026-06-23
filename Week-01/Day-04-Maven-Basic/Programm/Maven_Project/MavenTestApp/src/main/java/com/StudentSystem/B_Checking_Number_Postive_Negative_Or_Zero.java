import java.util.Scanner;
class B_Checking_Number_Postive_Negative_Or_Zero
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

int num = sc.nextInt();

if(num>=0)
{
  if(num==0)
  {
    System.out.println("Number is 0");
  }
  else
  {
  System.out.println("Number is Positive");
  }
}
else
{
  System.out.println("Number is Negative");
}


}
}