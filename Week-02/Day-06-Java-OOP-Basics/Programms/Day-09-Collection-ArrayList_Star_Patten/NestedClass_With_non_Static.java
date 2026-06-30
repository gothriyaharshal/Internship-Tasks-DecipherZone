
class Outer
{
   class Inner
   {
       void print()
       {
           System.out.println("Non static inner class method");
       }
   }
}


public class NestedClass_With_non_Static {
    public static void main(String[] args) {

        Outer o = new Outer();

        Outer.Inner outer = o.new Inner();

        outer.print();
    }
}