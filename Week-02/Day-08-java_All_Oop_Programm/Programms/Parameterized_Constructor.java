class Parameterized_Constructor
{

int id ; 

String name;

Parameterized_Constructor()
{
  System.out.println("Called when object were created");
}

Parameterized_Constructor(int id , String name)
{
 this.id = id;
 this.name = name;

}


public static void main(String args[])
{
Parameterized_Constructor d = new Parameterized_Constructor();
System.out.println(d.id);
System.out.println(d.name);
}
}