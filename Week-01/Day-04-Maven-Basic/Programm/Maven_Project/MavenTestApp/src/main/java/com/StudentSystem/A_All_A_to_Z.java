import java.util.Scanner;

class A_All_A_to_Z
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter your character");
char ch = sc.next().charAt(0);

for(char i = ch ; i<='z' ; i++)
{
System.out.print(i+" ");
}

}
}

//From this particular code we print from any character to Z