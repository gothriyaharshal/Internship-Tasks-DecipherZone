import java.util.*;
public class F_hollowRectangle
{
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
    System.out.println("Enter how many row you want");
    int row = scanner.nextInt();

    System.out.println("Enter how many column you want in your square matrix");
    int column = scanner.nextInt();

    for (int i = 1 ; i<=row ; i++)
    {
        int temp = column;
        ArrayList<String> stringArrayList = new ArrayList<>();


        while (temp>0) {
            if(i == 1 || i == row || temp == 1 || temp == column) {

                stringArrayList.add("*");
            }
            else
            {
                stringArrayList.add(" ");
            }
            temp--;
        }
        arrayList.add(stringArrayList);
    }


    Iterator<ArrayList<String>> iterator = arrayList.iterator();
    while (iterator.hasNext())
    {
        ArrayList<String> stringArrayList1 =  iterator.next();
        for (String s : stringArrayList1)
        {
            System.out.print(s);
        }
        System.out.println();
    }
}
}