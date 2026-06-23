import java.util.Scanner;

class L_Plus_Pattern
{
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your row");
   int row = sc.nextInt();

   System.out.println("Enter your column");
   int column = sc.nextInt();

for(int i = 1; i<=row ; i++) 
{
 for(int j = 1 ; j<=column ; j++)
 {
if(i==(row/2)+1 || j == (column/2)+1)
{
   System.out.print("*");
}
else
{
 System.out.print(" ");
} 
}
 System.out.println();

}
 }
}