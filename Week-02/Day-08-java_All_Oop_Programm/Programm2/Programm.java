import java.util.*;

public class Programm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you range of array");

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i<arr.length ; i++)
        {
            arr[i]= scanner.nextInt();
        }

        List list =  Arrays.asList(arr);
        System.out.println(list);
    }
}