package Access_Modifiers;

public class Just_Testing_2 {
    public static void main(String[] args) {
        Just_Testing justTesting = new Just_Testing();
        System.out.println(justTesting.publicMarks);

        //System.out.println(justTesting.privatMarks);
        //here this private accesmodifer of that class didnt accesible

        System.out.println(justTesting.defaultMarks);
        System.out.println(justTesting.protectedMarks);


    }
}

//Now we creating another package were we testing which accessmodifier were accesecible over there and which is'nt