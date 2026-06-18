import java.util.Scanner;

class Specific_ones
{
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);

 System.out.println("Enter row ");
int row = sc.nextInt();
  
System.out.println("Enter your character from which you want to start");

  char ch = sc.next().charAt(0);

for(int i = 1 ; i<=row ; i++)
{
char temp = ch;

 for(int j = 1 ; j<=i ; j++)
 {
   System.out.print(ch);
   ch++;
 }

ch = (char)(temp-1);

System.out.println();
}
   
}
}