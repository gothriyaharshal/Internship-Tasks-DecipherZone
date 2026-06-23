import java.util.Scanner;

class Special_Number_Pattern
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

 for(int space = 1 ; space<=row-i ; space++)
  {
    System.out.print(" ");
  }


 for(int j = i ; j>=1 ; j--)
  {
    System.out.print(j);
  }


 for(int k = 2 ; k<=i ; k++)
  {
    System.out.print(k);
  }

    System.out.println();
}

}
}

