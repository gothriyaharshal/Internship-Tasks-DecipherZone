//printing strong number
import java.util.Scanner;
public class Strong_Number
{

public static int fact(int num)
{

 if(num==1) return num;
 
return fact(num-1) * num;
}


public static boolean isStrong(int num)
{
int temp = num;
  int sum = 0 ;
  while(num!=0)
 {
   int digit = num%10;
   sum = sum+fact(digit);
   num = num/10;
 }

if(sum==temp)
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
    
  int num = sc.nextInt();
   
 if(isStrong(num))
 {
  System.out.print("Strong number");
 }
else
{
System.out.print("Not a strong number");
}
   
  }
}