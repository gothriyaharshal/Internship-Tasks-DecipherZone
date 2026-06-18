/*
//In java 14 in switch case there has serval ammount of enhasment lets discuss on them

//switch case only check equality here i didn't go with booleand like (i>4) or like that      //but we did in if else

//Switch is more efficient then if else...in if else we check from first condition to last till we not find exact matching ....but switch direct jump on that particular case 

//this efficiency of switch case provide by jvm it provide jump table like array if 1 come then it direct run first case if 2 occur then case runs there has O(1) complexity

//jump table not always efficient or created why 

//because if i pass in expression 100000 and my case are like 1 10 100 200 40000 like that
  they all far away value from one value so.....if we create jump table then there has creation of array of 100000 data in jump table

//but internally if i has case like 1 1000 10000 then jvm only create 3 size of jump table..not from 1 to 1000000 type so we achive effectiveness here(Here binary search occurs known as lookup switch)


//so when there has near by near next value in case like case 1 case 2 difference were less then only jump table creation perform(if i know my number has very less ddiff then we create all case jump table)


//Nested Switch case

*/

import java.util.Scanner;

class B_Switc_Case
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
 
int i = sc.nextInt();

 int result = switch (i)
 {
     case 1 -> 90;
     case 2 -> 2;
     default -> 0;
 };
    System.out.println(result);


//multiple case has one options

int num = 2;

switch(num)
{
    case 1,2,3 -> System.out.println("Small number");
    case 4,5,6 -> System.out.println("Medium");
    default -> System.out.println("Large");
}


//auto pattern matching

Object ob = "Hello";

 switch(ob)
{
case Integer inte -> System.out.println("Int value");

case String stee -> System.out.println("String value");

default -> System.out.print("other object");
};


}
}

