import  java.util.*;

public class A_Rectangular_Star_Pattern {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        List<String> list = new ArrayList<>();



        int row = scanner.nextInt();
        int column = scanner.nextInt();


        for(int i = 1 ; i<=row ; i++)
        {
            for(int j = 1 ; j<=column ; j++)
            {
                list.add("*");
            }
        }

        Iterator<String> itr = list.iterator();
          int count  = 0;
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
            count++;
            if(count==column)
            {
                System.out.println();
                count=0;
            }
        }

    }
}

/*
second best way approch
import java.util.*;

public class A_Rectangular_Star_Pattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        int row = scanner.nextInt();
        int column = scanner.nextInt();


        for(int i = 1; i <= row; i++) {

            for(int j = 1; j <= column; j++) {
                list.add("*");
            }

            list.add("\n"); // row end mark
        }


        for(String s : list) {

            if(s.equals("\n")) {
                System.out.println();
            }
            else {
                System.out.print(s + " ");
            }
        }

        scanner.close();
    }
}

* */