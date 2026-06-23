import java.util.Scanner;
class sum
{
public static void main(String[] args)
{
Scanner sc  = new Scanner(System.in);
int sum = 0;
int n = sc.nextInt();

int[] arr = new int[n];

for(int i = 0 ; i<arr.length ; i++)
{
  arr[i] = sc.nextInt();
}



for(int i = 0 ; i<arr.length ; i++)
{
  sum = sum+arr[i] ;
}

System.out.println(sum);
}
}