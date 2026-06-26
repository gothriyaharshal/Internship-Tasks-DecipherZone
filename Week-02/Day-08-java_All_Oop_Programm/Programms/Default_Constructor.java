class Default_Constructor
{


int id ; 

String name;

static{
System.out.println("First this one appers after it other one");
}

Default_Constructor()
{
  System.out.println("Called when object were created");
}

public static void main(String args[])
{
Default_Constructor d = new Default_Constructor();
}
}