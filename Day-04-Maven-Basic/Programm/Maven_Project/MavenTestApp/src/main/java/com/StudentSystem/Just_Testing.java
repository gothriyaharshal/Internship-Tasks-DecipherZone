package Access_Modifiers;

public class Just_Testing {

    public int publicMarks = 90;
    private int privatMarks = 100;
    int defaultMarks = 50;
    protected int protectedMarks = 80;
    public static void main(String[] args) {

        Just_Testing justTesting = new Just_Testing();
        System.out.println(justTesting.publicMarks);
        System.out.println(justTesting.privatMarks);
        System.out.println(justTesting.defaultMarks);
        System.out.println(justTesting.protectedMarks);

    }
}

//Here what happens like in same class all access modifier were accesible
//lets making another class in same package and creating object of that class and see what happens
