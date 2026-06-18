import java.util.Scanner;

class I_Hollow_Diamon_Pattern
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
   for(int space = 1 ; space <= row-i ; space++)
   {
     System.out.print(" ");
   }

  for(int j = 1; j<=2*i-1 ; j++)
  {
    if(i==1|| j==1  || j==2*i-1)
{
    System.out.print("*");
}

else{
System.out.print(" ");
 } 
 }

System.out.println();
 }


for(int i = row-1; i>=1 ; i--)
 {
   for(int space = 1 ; space <= row-i ; space++)
   {
     System.out.print(" ");
   }

  for(int j = 1; j<=2*i-1 ; j++)
  {
   if(i==1|| j==1  || j==2*i-1)
{
    System.out.print("*");
} 

else{
System.out.print(" ");
 }
  }

System.out.println();
 }



}
}