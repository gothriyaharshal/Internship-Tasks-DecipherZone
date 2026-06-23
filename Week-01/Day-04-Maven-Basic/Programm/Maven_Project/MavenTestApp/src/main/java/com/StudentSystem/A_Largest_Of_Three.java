/*
1. Find the largest among 3 numbers using nested if-else

Input:
a = 10
b = 25
c = 15

Output:
Largest number is 25
*/
import java.util.Scanner;
class A_Largest_Of_Three
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

if(a>b)
{
  if(a>c)
  { 
   System.out.println("A is greater");
   }
else
 {
 System.out.println("c is greater");
  
 }
}
else   //b is greater then a 
{
  if(b>c) 
{
 System.out.println("B is greater");
}
else
{
 System.out.println("c is greater");

}
}

}
}