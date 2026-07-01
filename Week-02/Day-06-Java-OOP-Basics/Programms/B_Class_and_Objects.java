import java.util.Scanner;

//bydefault value of instance varibles

public class B_Class_and_Objects

{


static int h;


public static void main(String[] args)
{
Student st = new Student();
System.out.println(st.age);
System.out.println(st.Roll_no);
System.out.println(st.salary);
System.out.println(st.name);



    /*


//but what happens when we took local varible lets //took

int x ; //it destroy automatic when main method end

System.out.println(x);

//i face error local varible store into stacks

    */
 //lets took an example of static varible

System.out.println(h);




}
}

class Student
{
int age ;
int Roll_no;
float salary;
String name;

/*
Student(int age,int Roll_no,float salary,String name)
{
this.age = age;
this.Roll_no=Roll_no;
this.salary = salary;
this.name = name;
}

*/


}