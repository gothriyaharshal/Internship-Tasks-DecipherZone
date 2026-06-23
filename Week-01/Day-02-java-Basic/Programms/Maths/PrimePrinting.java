//displaying prime number from 1 to end
import java.util.Scanner;
class PrimePrinting
{



public static boolean isPrime(int num)
{
  if(num == 1)
  {
    return false;
  }
int j ;
 
 for(j  = 2 ; j<num ; j++)
 {
   if(num%j==0)
   {
      return false;
   }
 }
if(j==num)
{
return true;
}
 
else
{
return false;
} 
}



 public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your range");
 
  int range = sc.nextInt();
 
  for(int i =1 ; i<=range ; i++)
  {
    if(isPrime(i))
     {

      System.out.print(i+" ");
     }

  }


}
}