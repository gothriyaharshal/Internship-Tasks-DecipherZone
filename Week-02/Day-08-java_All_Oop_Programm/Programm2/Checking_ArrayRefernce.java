import java.util.*;

public class Checking_ArrayRefernce {
        public static void main(String[] args) {
            int[] arr = new int[]{1,2,3};

            arr = new int[]{1,2};

            System.out.println(Arrays.toString(arr));
        }

}