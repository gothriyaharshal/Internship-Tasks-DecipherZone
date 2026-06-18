import java.util.Scanner;
class B_Increasing_Pattern
{
public static void main(String[] args)
{


Scanner sc = new Scanner(System.in);

System.out.println("Enter your character");
char ch = sc.next().charAt(0);


int row = sc.nextInt();

for(int i = 1 ; i<=row ; i++)
{
char s = 'a' ;

for(int j = 1 ; j<=i ; j++)
{
System.out.print(s);
s++;
}

System.out.println();
}

}
}