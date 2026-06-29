import java.util.*;

public class E_Inverted_Pyramid
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();

        System.out.println("Enter how many rows you want");
        int row = scanner.nextInt();

        for (int i = row ; i>=1 ; i--)
        {
            ArrayList<String> arrayList1 = new ArrayList<>();

            //first here we want to print spacw then after there has star printing happens
            int space = row-i;
            while (space>0)
            {
                arrayList1.add(" ");
                space--;
            }

            //now we prints star
            int star = 2*i-1;
            while (star>0)
            {
                arrayList1.add("*");
                star--;
            }

            arrayList.add(arrayList1);
        }

        //printing whole part
        Iterator<ArrayList<String>> iterator = arrayList.iterator();
        while (iterator.hasNext())
        {
            ArrayList<String> internalPart = iterator.next();
            for (String str : internalPart)
            {
                System.out.print(str);
            }
            System.out.println();
        }
    }
}