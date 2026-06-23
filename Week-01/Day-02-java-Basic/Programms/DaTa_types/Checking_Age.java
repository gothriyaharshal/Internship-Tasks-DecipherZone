import java.util.Scanner;
class Checking_Age
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

//taking age salart phone number name as user input and printing them

System.out.println("Enter your phone number");
double phone_number = sc.nextDouble();

System.out.println("Enter your Salary");
float salary = sc.nextFloat();

sc.nextLine();

System.out.println("Enter your Name");
String name= sc.nextLine();

System.out.println(phone_number);
System.out.println(salary);
System.out.println(name);

}
}