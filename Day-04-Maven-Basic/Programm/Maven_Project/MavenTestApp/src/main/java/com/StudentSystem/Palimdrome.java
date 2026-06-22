import java.util.Scanner;

class Palimdrome
{

public static boolean isPalimdrome(int num)
{
 int rev = 0;
 int temp = num;
 while(num!=0)
{
 int digit = num%10;
 rev = rev*10+digit;
 num = num/10;

}
if(temp==rev)
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
 
  int num = sc.nextInt();
 
  if( isPalimdrome(num) )
  {
    System.out.println("yes");
  }
  else
  {
  System.out.println("No");
  
   }

}
}