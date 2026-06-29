import java.util.*;

public class H_Diamond_Patterrn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<List<String>> arrayList  = new ArrayList<>();

        System.out.println("Enter your first half row by including it we form its under path so full pyramid were made");
        int row = scanner.nextInt();

        for (int i = 1 ;i<=row ; i++)
        {
            List<String> arrayList1 = new ArrayList<>();

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


        for (int i = row-1 ;i>=1 ; i--)
        {
            List<String> arrayList2 = new ArrayList<>();

            int space = row-i;
            while (space>0)
            {
                arrayList2.add(" ");
                space--;
            }

            int star = 2*i-1;
            while (star>0)
            {
                arrayList2.add("*");
                star--;
            }
            arrayList.add(arrayList2);
        }

        Iterator<List<String>> iterator = arrayList.iterator();
        while (iterator.hasNext())
        {
            List<String> innerElement = iterator.next();
            for (String s : innerElement)
            {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}