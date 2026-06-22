import java.util.Scanner;
class A_NumberEvenOdd
{
  public static void main(String[] args)
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your number");
   int num = sc.nextInt();

  if(num%2==0)                          //we also apply this condition like ........if(num&1 == 0) it is even by bit manipulation
 {
   System.out.println("Even");
 }
else
{
  System.out.println("odd");
 
}
  }  
}