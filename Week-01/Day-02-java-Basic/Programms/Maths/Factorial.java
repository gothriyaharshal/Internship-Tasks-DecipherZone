import java.util.Scanner;

class Factorial
{

public static int fact(int num)
{

if(num==1) return num;

return fact(num-1)*num;
}



public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
   System.out.println("Enter your range");
 
  int range = sc.nextInt();
 
   int result = fact(range);
  System.out.println(result);
  }

}