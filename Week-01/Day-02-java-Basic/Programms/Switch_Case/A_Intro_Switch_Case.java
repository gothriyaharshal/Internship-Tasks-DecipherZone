import java.util.Scanner;

//syntax and its limited use cases
//only evaluated by int char byte short enumaration
//no duplicate case allowed ...if else we apply repeated conditions

//after jdk7
//we use String in expression also


class A_Intro_Switch_Case
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

String I = sc.nextLine();
switch(I)
{
case "Hyy" : 
System.out.println("I is 1");
break;

case "Hello" : 
System.out.println("I is 2");
break;

case "sd" : 
System.out.println("I is 3");
break;

default : 
System.out.println("I is greater then 3");
break;

}

}
}


