

import java.util.Scanner;

public class D_This_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Using_OF_This usingOfThis = new Using_OF_This(10,20);
        usingOfThis.print();
        usingOfThis.selected();


        System.out.println("Apperently using this keyword for calling ");

        Using_OF_This usingOfThis1 = new Using_OF_This();
        
    }
}

class Using_OF_This
{
    int a;
    int b;

    Using_OF_This(int a , int b)
    {
        //this keyword work an an refrence of current class
        this.a = a;
        this.b=b;
    }

    //this keyword is also helpful for calling current class method
    public void print()
    {
       // this.selected();
        System.out.println("Print method calls");
    }

    public void selected()
    {
        this.print();
        System.out.println("Selected method calls");
    }

    //this keyword is also usefull for calling constructor
    Using_OF_This()
    {
        this(20,200);
    }

}