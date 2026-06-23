
import java.util.Scanner;

class MaxValue
{

public static int findMax(int[] arr)
{
   int max = 0;
   for(int i = 0 ; i<arr.length ; i++)
   {

    if(arr[i]>max)
   {
     max = arr[i];
    }
    }

return max;
}



public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter range of your array");
int n = sc.nextInt();

int[] arr = new int[n];

System.out.println("Enter your elements");

for(int i = 0 ;i<arr.length ; i++)
{
 arr[i] = sc.nextInt();
}

int result = findMax(arr);
System.out.print(result);
}
}