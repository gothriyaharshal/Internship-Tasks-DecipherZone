import java.util.Scanner;

class G_Right_Angle_Triangle
{

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your row");
int row = sc.nextInt();

System.out.println("Enter your column");
int column = sc.nextInt();

for(int i = 1 ; i<=row ; i++)
{
//printing spaces
for(int space = 1; space<=row-i ; space++)
{
System.out.print(" ");
}


for(int j = 1 ; j<=i ; j++)
{
System.out.println("*");
}

System.out.println();
}
}
}