import java.util.Scanner;




class Typecasting
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

/*
int → double
double → int
char → int
*/


//converting int to double ....moving 4 byte into 8 byte
int  a = 10 ;

double d= a ;

System.out.println("Implicit type casting ->" + d);


//Explicit type casting
//converting double to int .....means 8 byte to 4 byte 

double c = 100.00;
int e = (int)c;
System.out.println("Explicit type casting--> "+e);


//converting charcter to int....(2 byte goes into 4 byte implicit)

char ch = 'A' ;

int converting_char = ch ;

System.out.println(converting_char);


//converting int to characters....(4 byte goes into 2 byte explicit)

int newFormation = 1222 ;

char chh = (char)newFormation ;

System.out.println(chh);

//while when we perform calculation with char then explicitly converting it into char if we want them into char else print in int


char u = 'a';

int k = u+90;
System.out.println(k);

//but when i want char then i want to change it in char

char y = (char)(u+50);

System.out.println(y);



double demo = 20.99;
int x = (int)demo;

System.out.println(x);

System.out.println(10 + 20 + "Java");
System.out.println("Java" + 10 + 20);
}
}