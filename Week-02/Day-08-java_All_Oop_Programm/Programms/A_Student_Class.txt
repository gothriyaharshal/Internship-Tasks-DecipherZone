//package oops;

class Parent_Class
{
    private int a =10 ;
    protected int b =20;
             int c=20;
    public int d=20;

public void setA(int a)
{
    this.a = a;
}

public int getA()
{
    return this.a;
}

}
class op
{

    public static void main(String[] args) {
        Parent_Class parentClass =new Parent_Class();
        // facing error  //System.out.println(parentClass.a);
        parentClass.setA(10000);
        int a_  =parentClass.getA();
        System.out.println(a_);
        System.out.println(parentClass.d);
        System.out.println(parentClass.c);
        System.out.println(parentClass.b);
    }
}