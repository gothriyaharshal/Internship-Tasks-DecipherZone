//printing number 1 to n in while loop

import java.util.Scanner;

public class Finding_Factorial
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter your number");

int num = sc.nextInt();

int product=1;
while(num!=0)
{
product = product*num;
num--;
}

System.out.println(product);

sc.close();
}

}