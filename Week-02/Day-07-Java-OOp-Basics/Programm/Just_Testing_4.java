import java.util.Scanner;

class Parent<T>
{
    private T a ;
    private T b;
    public T getValue()
    {
        return a;
    }
    public T getB()
    {
        return b;
    }
    Parent(T a , T b)
    {
        this.a = a;
        this.b =b;
    }
}
public class Just_Testing_4 {
    public static void main(String[] args) {
        Parent<Integer> p = new Parent<>(10,20);

        System.out.println(p.getValue() +5 );

        Parent<String> s = new Parent<>("Harshal","Gothriya");

        System.out.println(s.getValue().length() );

    }
}
