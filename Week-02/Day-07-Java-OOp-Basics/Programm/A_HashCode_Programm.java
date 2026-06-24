import java.util.Scanner;
import java.util.*;


public class A_HashCode_Programm
{

int id ;

String name ; 


public int hashCode()
{
return this.id;
}


public boolean equals(Object obj)
{
   if(this == obj)
{
  return true;
}

 if(!(obj instanceof A_HashCode_Programm
))
{
return false;
}

A_HashCode_Programm a = (A_HashCode_Programm)obj;

if((this.id == a.id) && (this.name == a.name))
{
return true;
}

else
{
return false;
}

}


A_HashCode_Programm
(int id , String name)
{
  this.id = id ;
  this.name = name;
}


public static void main(String[] args)
{

A_HashCode_Programm a1 = new A_HashCode_Programm(1,"harshal");
A_HashCode_Programm a2 = new A_HashCode_Programm(1,"harshal");


HashSet<A_HashCode_Programm>  s = new HashSet<>();

s.add(a1);
s.add(a2);


System.out.println(s.size());

}
}