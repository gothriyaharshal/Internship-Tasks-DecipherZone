

class PetrolEngine
{
    void start()
    {
        System.out.print("Starting with petrol");
    }
}

class ElectricEngine
{
    void start()
    {
        System.out.println("------------------>Starting with Electricity");
    }
}


class PetrolCar extends PetrolEngine{
    void drive()
    {
        System.out.print("Drived by an cool men");
    }
}

class ElectricCar extends ElectricEngine{
    void drive()
    {
        System.out.println("------------------>Drived by an comman men");
    }
}

public class G_Tight_coupling {

    public static void main(String[] args) {
        PetrolCar petrolCar = new PetrolCar();
        petrolCar.start();
        petrolCar.drive();
        System.out.println();
        ElectricCar electricCar = new ElectricCar();
        electricCar.start();
        electricCar.drive();
    }
}
