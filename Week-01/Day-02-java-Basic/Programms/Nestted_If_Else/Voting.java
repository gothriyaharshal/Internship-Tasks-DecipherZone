import java.util.Scanner;
class Voting
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

int age = sc.nextInt();

if(age>=18)
{
  if(age<60)
  {
    System.out.println("You are eligible to vote but you are not senior citizen");
  }
  else
  {
  System.out.println("you are eligible to vote and you are senior citizen");
  }
}
else
{
  System.out.println("Sorry kiddo grow first");
}


}
}