import java.util.*;


public class Rectangle
{
public static void main(String[] args)
{

Scanner scanner = new Scanner(System.in);

ArrayList<Integer> arrayList = new ArrayList<>();


int row = scanner.nextInt();
int column = scanner.nextInt();


for(int i = 1 ; i<=row ; i++)
{
   for(int j = 1 ; j<=column ; j++)
   {
      arrayList.add(j);
   }
  System.out.println();
} 

for(int s : arrayList)
{
System.out.println(s);
}


}
}