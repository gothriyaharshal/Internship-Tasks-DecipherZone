
import java.util.Scanner;
class B
{
    int a =90;
    int b;

    public void printing()
    {
        System.out.println("Print method");
    }

    B()
    {
        System.out.print("Automatic B constructro were called");
    }
}

public class E_Super_ extends B {
    int a = 10;
    public void displae()
    {
        System.out.println(this.a);
        System.out.println(super.a);
    }

    public void starting()
    {
        super.printing();
        System.out.println("first printing method called");
    }

    E_Super_()
    {
        System.out.println("first B then me");
    }

    public static void main(String[] args) {
       E_Super_ eSuper=new E_Super_();
       eSuper.displae();
      eSuper.starting();

    }
}