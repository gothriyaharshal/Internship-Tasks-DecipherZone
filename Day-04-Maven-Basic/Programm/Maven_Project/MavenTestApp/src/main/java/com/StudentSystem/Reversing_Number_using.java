//printing number 1 to n in while loop

import java.util.Scanner;

public class Reversing_Number_using
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your number");

int num = sc.nextInt();

int rev = 0;
int temp = num ;


/*
int rev = 0;
int temp = num ;

while(num!=0)
{
int digit = num%10;
rev = rev*10+digit;
num = num/10;
}

System.out.println(rev);
*/

//by for loop

for(int i = num ; i>0 ; i=i/10)
{
int digit = i%10;
rev = rev*10+digit;
}


System.out.println(rev);
sc.close();
}

}