

class Outer {

    int a = 10;
    static  int b = 20;

    static class NestedClaas {


        void display()
        {
            System.out.println(b);

            Outer outer = new Outer();
            System.out.println(outer.a);
        }

        void print() {
            System.out.println("Printing nested class function");
        }
    }
}

public class Immutable_Class {

    public static void main(String[] args) {

        Outer outer = new Outer();

        Outer.NestedClaas nestedClaas = new Outer.NestedClaas();
        nestedClaas.print();


    }
}


