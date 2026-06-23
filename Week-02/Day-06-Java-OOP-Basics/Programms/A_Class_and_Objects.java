import java.util.Scanner;


public class A_Class_and_Objects
{
public static void main(String[] args)
{

Student s = new Student(21,1234,230000,"Harshal");
s.Studing();

s.Lunch();
System.out.println(s.age) ;
System.out.println(s.Roll_no);
System.out.println(s.salary);
System.out.println(s.name);

Student.Lunch();
}
}

class Student
{
int age ;
int Roll_no;
float salary;
String name;

Student(int age,int Roll_no,float salary,String name)
{
this.age = age;
this.Roll_no=Roll_no;
this.salary = salary;
this.name = name;
}

void Studing()
{
System.out.println("Studing till 7 pm form 10 am");
}

static void Lunch()
{
System.out.println("Included with lunch");
}

}