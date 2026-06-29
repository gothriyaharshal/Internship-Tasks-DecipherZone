
import java.util.*;
public class D_Normal_Rectangular_Pyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();

        System.out.println("Enter how many rows you want");
        int row = scanner.nextInt();

        for (int i = 1; i <= row; i++) {
            System.out.println("Enter how many column you want");
            int column = scanner.nextInt();

            ArrayList<String> arrayList1 = new ArrayList<>();
            while (column > 0) {
                arrayList1.add("*");
                column--;
            }

            arrayList.add(arrayList1);
        }

        Iterator<ArrayList<String>> itr = arrayList.iterator();


        while(itr.hasNext()) {

            ArrayList<String> currentRow = itr.next();

            for(String star : currentRow) {
                System.out.print(star + " ");
            }

            System.out.println();
        }
    }
}