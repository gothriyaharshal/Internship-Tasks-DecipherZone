
public class F_Copy_constructor {
    int a ;
    int b ;

    F_Copy_constructor(int a , int b)
    {
        this.a  = a;
        this.b = b;
    }

    public static void main(String[] args) {
        F_Copy_constructor fCopyConstructor = new F_Copy_constructor(1,2);

        F_Copy_constructor fCopyConstructor1 = fCopyConstructor;
        System.out.println(fCopyConstructor1.a);
        System.out.println(fCopyConstructor1.b);
    }
}
