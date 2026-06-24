import java.util.Scanner;

public class A_Equal_Programm
{

int id ;

String name ; 

A_Equal_Programm(int id , String name)
{
  this.id = id ;
  this.name = name;
}


public boolean equals(Object obj)
{
   //what happens our this.id compare with obj.id 
   //convert obj into class type 

  if(this == obj)
  {
    return true;
  }

  if(!(obj instanceof A_Equal_Programm
))
   {
      return false;
   }

  //converting obj into Student type
  
A_Equal_Programm
 s = (A_Equal_Programm
)obj;

if(this.id == s.id)
{ 
 return true;
}
else
{
return false;
}
}

public static void main(String[] args)
{

A_Equal_Programm a = new A_Equal_Programm(1,"Harshal");

A_Equal_Programm a1 = new A_Equal_Programm(1,"Harshal");


// Boolean result = a.equals(a1);

//Now we making our own equal method then gives its 
//implementation through id comparisions

/*
System.out.println("By default it comparing refrence --> " + result);
*/

 Boolean result = a.equals(a1);
System.out.println("By default it comparing implementd equal --> " + result);


}
}



//if i has multiple fileds in my obejct then i comparing it with that condition like

return (this.id == s.id && this.name == this.name)  if those are true then only return true else false


//if obj == null return fasle

like if i give   Student s = null;
  and give it like .....s1.equals(s3);


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

hashcode()

>>it returns me an the integer value of an particular object in formate of hexadecimal

>>given unique value to obejct

>>if i didnot over ride hashcode then it gives me an...normal hascode value of that object

Student s1 = new  Student(1,"Harshal");

s1.hashcode();     //then it give bydefault value

>>>

1 Rule>>

 java gives rule that

if i have 2 obejct and they are euqals like 
 
 Student s1 = new Student(1,"Aditya");

 Student s1 = new Student(1,"Aditya");

s1.equals(s2);    //if this is true then there hashcode must be same


this uses in hash type 

first we calculate hashcode (usually we took id as hashcode) ...if hashcode is equal then we run equal method it ....check data obejct is equal or not if it give true like eqal then we not add

2 Rule>>

if hashcode is equal then it not always possiblee that they eqaul they might be eqaul or not

Yes, exactly. Same hashCode does NOT mean data is equal. ✅

hashCode() only helps to find a possible location (bucket). It is not the final comparison.

Example:

class Student {

    int id;

    Student(int id) {
        this.id = id;
    }

    public int hashCode() {
        return 10;   // everyone gets same hash
    }

    public boolean equals(Object obj) {
        Student s = (Student)obj;
        return this.id == s.id;
    }
}

Now:

Student s1 = new Student(10);
Student s2 = new Student(20);

Both have:

s1.hashCode() = 10
s2.hashCode() = 10

Same hashCode.

But:

s1.equals(s2)

checks:

10 == 20

false.

So they are different.

Think like a house address:

hashCode() = city name 🏙️
equals() = exact house number 🏠

Two people can live in the same city, but not the same house.

Flow in HashSet:

new object
    |
    v
hashCode()
    |
    v
go to bucket
    |
    v
equals() check with objects there
    |
    v
duplicate or not

Rules:

Same hashCode → may be equal OR may be different ✅
Equal objects → must have same hashCode ✅
Different hashCode → definitely not equal (normally) ✅

So your statement is correct:
"If hashCode is same, it is not mandatory that data is equal." 👍



>>>>>>>>>>>>>>>>>>>

Means like that...... s1.equals(s2);.......both pointing to same data then ...there hashcode must be same becuse we dont want duplicate value so vo store it only one 