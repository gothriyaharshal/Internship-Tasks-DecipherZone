/*
import java.util.Scanner;
class MiniCalculater
{

public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);


boolean restart ;

do{

System.out.println("Enter your first Number");
int a = sc.nextInt();

System.out.println("Enter your Second number");
int b = sc.nextInt();


System.out.println("if you want addition press +");
System.out.println("if you want Subtraction press -");
System.out.println("if you want Multiplication press *");
System.out.println("if you want division press /");

char ch = sc.next().charAt(0);



switch(ch)

{
 case '+' : 
  System.out.println(a+b);
  break;
 case '-' : 
  System.out.println(a-b);
  break;
 case '/' : 
  System.out.println(a/b);
  break;
 case '*' : 
  System.out.println(a*b);
  break;
 default:
  System.out.println("Please enter valid charcter");
}

System.out.println("Do you want to restart the game Press 'Y' for yes or 'N' for no");


char checker = sc.next().charAt(0);

if(checker=='Y' || checker=='y')
{
restart = true;
}
else
{
restart = false;
}

}
while(restart);


}
}  */


//new version of switch case

import java.util.Scanner;
class MiniCalculater
{

public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);


boolean restart ;

do{

System.out.println("Enter your first Number");
int a = sc.nextInt();

System.out.println("Enter your Second number");
int b = sc.nextInt();


System.out.println("if you want addition press +");
System.out.println("if you want Subtraction press -");
System.out.println("if you want Multiplication press *");
System.out.println("if you want division press /");

char ch = sc.next().charAt(0);



int result = switch(ch)
            {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                case '/' -> a / b;
                default -> 0;
            };

System.out.println(result);

System.out.println("Do you want to restart the game Press 'Y' for yes or 'N' for no");


char checker = sc.next().charAt(0);

if(checker=='Y' || checker=='y')
{
restart = true;
}
else
{
restart = false;
}

}
while(restart);


}
}



