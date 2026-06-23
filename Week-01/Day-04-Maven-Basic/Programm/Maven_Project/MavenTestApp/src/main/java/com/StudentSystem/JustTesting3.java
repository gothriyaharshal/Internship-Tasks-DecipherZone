package Access_Modifier2;

import Access_Modifiers.Just_Testing;

public class JustTesting3 extends Just_Testing{
    public static void main(String[] args) {
        JustTesting3 justTesting = new JustTesting3();
        System.out.println(justTesting.publicMarks);
       // System.out.println(justTesting.privatMarks);
       // System.out.println(justTesting.defaultMarks);
        System.out.println(justTesting.protectedMarks);
    }
}

//here only protected and public were accesible