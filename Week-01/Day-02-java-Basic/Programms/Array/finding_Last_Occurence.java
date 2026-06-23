import java.util.Scanner;

class finding_Last_Occurence
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



int lastOccurence = -1;
System.out.println("Enter your number which last index you want to find");
int num = sc.nextInt();
for(int i = 0 ; i<arr.length ; i++)
{
  if(arr[i]==num)
  {
    lastOccurence = i ;
  }
}


System.out.println(lastOccurence);
}
}