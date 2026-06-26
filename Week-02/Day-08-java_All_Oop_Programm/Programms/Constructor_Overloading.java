import java.util.Scanner;

public class Constructor_Overloading
{
public static void main(String[] args)
{
 Scanner sc= new Scanner(System.in);

 Car c = new Car();
Car c1 = new Car(10);
Car c2 = new Car(200,"Harhalw");

System.out.println(c.car_Id);
System.out.println(c.car_name);

System.out.println();
System.out.println();


System.out.println(c1.car_Id);
System.out.println(c1.car_name);

System.out.println();
System.out.println();



System.out.println(c2.car_Id);
System.out.println(c2.car_name);


}
}


class Car
{
  int car_Id;
   String car_name;

 Car()
{
System.out.println("This is an default behaviour ");
}


Car(int car_Id)
{
this.car_Id = car_Id;
}

Car(int car_Id , String car_name )
{
this.car_Id = car_Id;
this.car_name = car_name;
}


}