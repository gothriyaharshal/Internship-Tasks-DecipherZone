import java.util.Scanner;

class MinValue
{

public static int findMin(int[] arr)
{
   int min = 100000;
   for(int i = 0 ; i<arr.length ; i++)
   {

    if(arr[i]<min)
   {
     min = arr[i];
    }
    }

return min;
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

int result = findMin(arr);
System.out.print(result);
}

}