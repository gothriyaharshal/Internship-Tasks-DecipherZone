import java.util.Scanner;

public class C_Car_Class {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        int current_Speed = scanner.nextInt();
        Car car = new Car("Alto",current_Speed);
        car.start() ;
        System.out.print("The "+car.Brand+" Moving with "+current_Speed);

        if(current_Speed>=81)
        {
            car.stop();
        }

    }
}
class Car
{
    String Brand ;
    int Speed;

   public Car(String Brand , int Speed)
    {
        this.Brand=Brand;
        this.Speed=Speed;
    }


    public void start()
    {
        System.out.println("your car is moving");

    }

    public void stop()
    {
        System.out.println("Car is Stopped please be slow");
    }
}