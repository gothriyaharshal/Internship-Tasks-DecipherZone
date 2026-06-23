import java.util.Scanner;

//bydefault value of instance varibles

public class C_Class_and_Constructor
{
public static void main(String[] args)
{
Student st = new Student();

}
}

class Student
{
int age ;
int Roll_no;
float salary;
String name;


Student()
{
this(30);
System.out.println("default constructor");
}

Student(int age)
{
this(30,234,2423,"Harry");
System.out.println("only age constructor"+age);
}



Student(int age,int Roll_no,float salary,String name)
{
System.out.println("calling final constructor");

this.age = age;
this.Roll_no=Roll_no;
this.salary = salary;
this.name = name;
}


}

