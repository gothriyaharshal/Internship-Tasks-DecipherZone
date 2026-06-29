
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class C_Normal_Two_Advanced_Star_Pyramid_Pattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();

        System.out.println("Enter how many rows you want");
        int row = scanner.nextInt();

        for(int i =1; i<=row ; i++)
        {
            ArrayList<String> arrayList1 = new ArrayList<>();

            int space = row-i;
            while (space>0)
            {
                arrayList1.add(" ");
                space--;
            }


            int star = 2*i-1;
            while (star>0)
            {
                arrayList1.add("*");
                star--;
            }

            arrayList.add(arrayList1);

        }

        //printing full arraylist
        Iterator<ArrayList<String>> iterator = arrayList.iterator();

        while (iterator.hasNext())
        {
            ArrayList<String> a = iterator.next();

            for (String str : a)
            {
                System.out.print(str+" ");
            }
            System.out.println();
        }
    }
}