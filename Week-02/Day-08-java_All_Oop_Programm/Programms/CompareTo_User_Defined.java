
import java.util.*;
import java.util.List;

        public class CompareTo_User_Defined implements Comparable<CompareTo_User_Defined>{
        int id ;
        String name;


        CompareTo_User_Defined(int id, String name)
        {
            this.id = id;
            this.name = name;
        }

        @Override
        public int compareTo(CompareTo_User_Defined o) {
            return this.id-o.id;
        }


        @Override
        public String toString() {
            return "Our id is---->"+this.id+"our name is"+this.name;
        }

        public static void main(String[] args) {

            CompareTo_User_Defined userDefinedComparble = new CompareTo_User_Defined(10000,"ram");
            CompareTo_User_Defined userDefinedComparble1 = new CompareTo_User_Defined(1,"Shyam");


            List<CompareTo_User_Defined> list = new ArrayList<>();
            list.add(userDefinedComparble);
            list.add(userDefinedComparble1);


            Collections.sort(list);

            for (CompareTo_User_Defined a: list)
            {
                System.out.println(a);
            }
        }
    }