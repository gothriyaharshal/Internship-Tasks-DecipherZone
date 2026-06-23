//printing number 1 to n in while loop

import java.util.Scanner;

public class Printing_Even_Number
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int start = 1;
int range = sc.nextInt();

while(start<=range)

{
if(start%2==0)
{
System.out.print(start+"   ");
}
start++;
}

sc.close();
}

}