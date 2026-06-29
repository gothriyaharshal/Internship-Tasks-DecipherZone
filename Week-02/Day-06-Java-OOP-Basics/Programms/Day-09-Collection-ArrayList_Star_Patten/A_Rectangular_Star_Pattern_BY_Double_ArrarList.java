/*

//study in notes part that how they work actually

ArrayList<ArrayList<String>> list = new ArrayList<>();

what does it mean like i have many Arrarlist<String> inside a one ArrayList ....

so if i make 2 AraayList<String>  add them star

ArrayList<String> a1  = new ArrayList<>();
a1.add("*");
a2.add("*");

ArrayList<String> a2  = new ArrayList<>();
a2.add("*");
a2.add("*");

then after in main arraylist i addd both of then.....ArrayList<ArrarList<String>> arratList = new ArrayList<>();  ....

arratList.add(a1);
arrayList.add(a2);

...output will be

a1(data)        a2(data)
*               *
*               *

it look like this
//lest do an example

*/

//by this programm we decide how many rwo did ik want we decide how many column i want ....a

import java.util.*;
public class A_Rectangular_Star_Pattern_BY_Double_ArrarList
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();

        System.out.println("Enter how many rows you want");
        int row = scanner.nextInt();

        while (row>0) {
            ArrayList<String> a1 = new ArrayList<>();                        //here be focus a1 refrence not created all the time ...we were in while loop every time internally new rfrence create if we declare it at upper portion ...not in while loop then problem occurs
            System.out.println("Enter how many columns you want");    //mtlb hr baar nya refence bnega vo data khud m store krega or upr wali arraylist m add krke finish ho jayega loop m hna ....fir waps bnega add krega or a1 fininsh access hum upper wali ko krege usme data h na
            int columns = scanner.nextInt();
            while (columns>0)
            {
                a1.add("*");
                columns--;
            }

            arrayList.add(a1);   //save this row
            row--;
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














