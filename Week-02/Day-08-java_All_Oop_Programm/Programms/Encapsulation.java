public class Encapsulation
{
public static void main(String[] args)

{
  Normal n = new Normal();
  n.setA(1);
  n.setB(2);
  n.setC(3);

  int a = n.getA();
  int b =   n.getB();
   int c = n.getC();

System.out.print(a);
System.out.print(b);
System.out.print(c);

}

}

class Normal
{
private int a ;

private int b;

private int c ;

public void setA(int a)
{
   this.a = a;
}

public int getA()
{
  return this.a;
}

public void setB(int b)
{
this.b = b;
}


public int getB()
{
  return this.b;
}


public void setC(int c)
{
this.c = c;
}

public int getC()
{
 return this.c;
}

}