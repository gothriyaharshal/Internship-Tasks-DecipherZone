//printing number 1 to n in while loop

import java.util.Scanner;

public class Printing_Number
{

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int start = 1 ;
int range = sc.nextInt();

while(start<=range)

{
System.out.print(start);
start++;
}

}

}