import java.util.Scanner;

class Login_System
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter your username");
String username = sc.nextLine();

System.out.println("Enter your password");
int password = sc.nextInt();


if(username.equals("gothriyaharshal14@gmail.com"))
{
  if(password == 1234)
  {
     System.out.println("User login succesfully");
   }
  else
{
  System.out.print("Incorrect password retry");
}
}
else
{
  System.out.print("Unauthorized user");

}

}
}