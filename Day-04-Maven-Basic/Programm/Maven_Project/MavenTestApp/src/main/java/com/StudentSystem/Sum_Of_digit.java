//printing number 1 to n in while loop

import java.util.Scanner;

public class Sum_Of_digit
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your number");

int num = sc.nextInt();

int sum=0;

while(num!=0)
{
int digit = num%10;
sum=sum+digit;
num = num/10;
}

System.out.println(sum);

sc.close();
}

}