//printing number 1 to n in while loop

import java.util.Scanner;

public class Sum_Of_Integer
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int sum = 0;
int range = sc.nextInt();

while(range!=0)

{
sum=sum+range;
range--;
}
System.out.println(sum);
sc.close();
}

}