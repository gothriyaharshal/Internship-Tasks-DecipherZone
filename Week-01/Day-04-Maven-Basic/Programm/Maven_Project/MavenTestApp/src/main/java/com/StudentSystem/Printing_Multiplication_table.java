//printing number 1 to n in while loop

import java.util.Scanner;

public class Printing_Multiplication_table
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter which integer table you want");


System.out.println("Enter your starting table");

int inte = sc.nextInt();
if(inte<=0) return;


System.out.println("Enter your Ending table");
int Ending_table =sc.nextInt();
if(Ending_table<=0) return;

while(inte<=Ending_table)
{

int start = 1;
int end = 10;
while(start<=end)

{
System.out.print(inte*start+"  " );
start++;
}
System.out.println();
inte++;
}
sc.close();
}

}