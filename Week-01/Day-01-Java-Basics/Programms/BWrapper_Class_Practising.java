public class Wrapper_Class_Practising {
    public static void main(String[] args) {

//if i want to onvert String into any primitve type then i have to use parse function

       String s = "100";
       int a = Integer.parseInt(s);
        System.out.print("Converting String to int==> "+a);

//when i want to convert an String into Wrapper class
        System.out.println();
        System.out.println();

        Integer b = Integer.valueOf(s);
        System.out.println(b);

        //When i want to convert primitve into wrapper class
        long l = 100l;
        Long d = Long.valueOf(l);
        System.out.println("Converting from primitive to Wrapper");

        //When i  want to convert from wrapper to primitvw then
        Integer e = 1000;
        int ee = e.intValue();

        System.out.println("Converting from wrapper to primitive" + ee);


       //when i want to convert number to an string
        int num = 199;
        String str = Integer.toString(num);

        System.out.println("Converting number to String"+str);

        //Comparing two object in effective way
        Integer obj1 = 10;
        Integer obj2 = 20;

        System.out.println("Comparing obj1 to obj2"+obj1.compareTo(obj2));
        System.out.println("Comparing obj2 to obj1"+obj2.compareTo(obj1));

    }
}
