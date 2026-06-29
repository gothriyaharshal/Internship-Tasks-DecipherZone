//first i show you how we normally form pyramid style

/*
 for loop starts form 1 to row then internally spaces were printed then after ....start were printed in j loop
 */

//if we create it by using Normal ArraList then how it is form look k overviesw

import java.util.*;
public class B_Pyramid_style_Pattern_Using {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println("Enter how many rows you want");
        int row = scanner.nextInt();

        System.out.println("Enter how many column you want");
        int column = scanner.nextInt();

        for (int i = 1 ; i<=row ; i++)
        {
            for (int space = 1 ; space<=row-i ; space++)
            {
                arrayList.add(" ");
            }
            for (int j = 1 ; j<=2*i-1 ; j++)
            {
                arrayList.add("*");
            }

            arrayList.add("\n");
        }

       /* Iterator itr = arrayList.iterator();
        int count = 0;
        while (itr.hasNext())
        {
            if(count==((2*i-1)+1))
            {
                count=0;
                System.out.println();
            }
            System.out.print(itr.next()+" ");
            count++;
        }*/

        for (String s : arrayList)
        {
            if(s.equals("\n"))
            {
             // continue;
                System.out.println();
            }
            else {
                System.out.print(s);
            }
        }

    }
}