
In encapsulation there has setter method also or constructor method also by both of them we insert data in variable ...but after inserting data from constructor if I want re update data then not possible because private varible  access not allowed ...allowed from getter method but how you set now

so we use setter at the first time you passes your at the time of object creation but after you want setter method for setting that data 

1>
Creates an Student class (name,age,marks) with display method

2>
Creates BankAccount class there method like deposit, withdraw and balance show()
 
3>
Making an 

default constructor ,
parametrized constructor, 
Constructor overloading , 

4>

this Keyword Whole use

5>
super keyword whole use

6>
All Access Modifier prgramms

Step 4: Inheritance (15 programs)

Example:

class Animal {

 void eat(){
  System.out.println("Eating");
 }

}

class Dog extends Animal {

 void bark(){
  System.out.println("Barking");
 }

}

Practice:

Animal → Dog
Vehicle → Car
Employee → Manager

Clear hoga:

extends
super
constructor chaining


Step 5: Polymorphism
Compile time

Method overloading:

add(int a,int b)

add(double a,double b)
Runtime

Override:

class Animal{
 void sound(){}
}

class Dog extends Animal{
 void sound(){}
}

Practice:

Payment system
Shape area
Step 6: Abstraction

Interface:

interface Payment {

 void pay();

}

Classes:

UPI
Card
Cash

Implement karo.

Clear hoga:

interface
abstract class
hiding implementation
Step 7: Encapsulation

Programs:

Bank:

private int balance;

getBalance()
setBalance()

Practice:

Student marks
Employee salary
Final Project Type OOP Practice

Ek mini project banao:

Library Management

Classes:

Book
Student
Library
Admin

Concepts:

encapsulation
inheritance
interface
polymorphism
access modifiers

Agar tum 40-50 chhote programs is order me kar loge, OOPs ke doubts kaafi had tak khud clear ho jayenge.

Senior ka approach sahi hai: code likhte waqt hi samajh aata hai ki private kyu hai, protected kab use hota hai, override kaise hota hai.

_________________________________________________________________________>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

compareTo method here what is in it ...it compare two data and then perform sorting .....


import java.util.*;
import java.util.List;

        public class CompareTo_User_Defined implements Comparable<CompareTo_User_Defined>{
        int id ;
        String name;


        CompareTo_User_Defined(int id, String name)
        {
            this.id = id;
            this.name = name;
        }

        @Override
        public int compareTo(CompareTo_User_Defined o) {
            return this.id-o.id;
        }


        @Override
        public String toString() {
            return "Our id is---->"+this.id+"our name is"+this.name;
        }

        public static void main(String[] args) {

            CompareTo_User_Defined userDefinedComparble = new CompareTo_User_Defined(10000,"ram");
            CompareTo_User_Defined userDefinedComparble1 = new CompareTo_User_Defined(1,"Shyam");


            List<CompareTo_User_Defined> list = new ArrayList<>();
            list.add(userDefinedComparble);
            list.add(userDefinedComparble1);


            Collections.sort(list);

            for (CompareTo_User_Defined a: list)
            {
                System.out.println(a);
            }
        }
    }
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

functional interface have one abstract method and many static or default method

we call it by ...

Function func = new Function()
{
   here our override were done of interface
};

>>>>>>>
int java 9 we decalre private method ..for internal use

interface there no allowed protected method because we did not override them
