import java.util.Scanner;

class Printing_All_Data_Types
{
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  

  System.out.println("Enter an byte");
  byte b = sc.nextByte();
  System.out.println("Byte value--->" + b);


  
  System.out.println("Enter an short");
  short s = sc.nextShort();
  System.out.println("short value--->" + s);



  System.out.println("Enter an int");
  int i = sc.nextInt();
  System.out.println("Int value--->" + i);

  

  System.out.println("Enter an long");
  long l = sc.nextLong();
  System.out.println("Byte value--->" + l);



  System.out.println("Enter an float");
  float f = sc.nextFloat();
  System.out.println("Byte value--->" + f);



  System.out.println("Enter an double");
  double d = sc.nextDouble();
  System.out.println("double value--->" + d);

  
  System.out.println("Enter an bool");
  boolean bool = sc.nextBoolean();
  System.out.println("bool value--->" + bool);

 
  System.out.println("Enter an char");
  char ch= sc.next().charAt(0);
  System.out.println("Char value--->" + ch);


  sc.nextLine();

  System.out.println("Enter an string");
  String str= sc.nextLine();
  System.out.println("String value--->" + str);


}
}