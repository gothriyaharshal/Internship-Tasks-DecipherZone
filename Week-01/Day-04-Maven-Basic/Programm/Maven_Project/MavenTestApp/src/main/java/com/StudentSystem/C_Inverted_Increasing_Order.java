import java.util.Scanner;
class C_Inverted_Increasing_Order
{
public static void main(String[] args)
{


Scanner sc = new Scanner(System.in);

System.out.println("Enter your character");
char ch = sc.next().charAt(0);


int row = sc.nextInt();

for(int i = row ; i>=1 ; i--)
{
char s = ch ;

for(int j = 1 ; j<=i ; j++)
{
System.out.print(s);
s++;
}

System.out.println();
}

}
}