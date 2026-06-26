
import java.util.Scanner;

public class A_Student_Class {
    int age;
    String name;
    float marks;

    A_Student_Class(int age , String name , float marks)
    {
        this.age = age;
        this.name=name;
        this.marks=marks;
    }

    public void display()
    {
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.marks);
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you age sir");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter your name sir");
        String name = scanner.nextLine();

        System.out.println("Enter you Marks sir");
        Float marks=scanner.nextFloat();

        A_Student_Class aStudentClass=new A_Student_Class(age,name,marks);
       // aStudentClass.toString();

        aStudentClass.display();
    }

}

