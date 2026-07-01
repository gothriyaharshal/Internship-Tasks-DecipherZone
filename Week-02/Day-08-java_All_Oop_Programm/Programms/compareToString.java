import java.util.*;

public class compareToString {
    //here what happens if it see diffrence at first character it return there and gives imediate result
    public static void main(String[] args) {
        String string = "Canana";
        String string1 = "Apple";

    //    System.out.print(string.compareTo(string1));

        Integer n1 = 10;
        Integer n2 = 20;
   //     System.out.print(n1.compareTo(n2));


        //for every wrapper classes compareTo were intrenally workd in collection.sort

        List<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(80);
        list.add(70);
        list.add(60);

        Collections.sort(list);


        for(Integer i : list)
        {
            System.out.print(i+" ");
        }


    }
}