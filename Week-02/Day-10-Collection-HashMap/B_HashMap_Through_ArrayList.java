import java.util.*;
public class B_HashMap_Through_ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many Element you want in ArrayList");
        int row = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 1 ; i<=row ; i++)
        {
            int column = 1;
            System.out.println("Enter your "+ row + " data");
            int data = scanner.nextInt();
            while (column>0) {
                arrayList.add(data);
                column--;
            }
        }

        HashMap<Integer,Integer> hashMap = frequencyArray(arrayList);

        display(hashMap);
    }
    public static void display(HashMap<Integer,Integer> hashMap)
    {
        for (Map.Entry<Integer,Integer> m : hashMap.entrySet())
        {
            System.out.println(m.getKey()+"----------->"+m.getValue());
        }
    }

    public static HashMap frequencyArray(ArrayList<Integer> arr)
    {
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i = 0 ; i<arr.size() ; i++)
        {
            if(hashMap.containsKey(arr.get(i)))
            {
                int target = hashMap.get(arr.get(i));
                hashMap.put(arr.get(i),target+1);
            }
            else {
                hashMap.put(arr.get(i),1);
            }
        }
        return hashMap;
    }

}