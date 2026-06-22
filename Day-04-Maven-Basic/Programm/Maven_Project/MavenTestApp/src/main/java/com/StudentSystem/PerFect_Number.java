import java.util.Scanner;

class PerFect_Number
{

public static boolean isPerfect(int num)
{
  
int sum = 0;

for(int i = 1 ; i<=num/2 ; i++)
{
if(num%i==0)
{
sum = sum+i;
}
}

if(sum==num)
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
    if(isPerfect(i))
     {

      System.out.print(i+" ");
     }

  }
	
}
}