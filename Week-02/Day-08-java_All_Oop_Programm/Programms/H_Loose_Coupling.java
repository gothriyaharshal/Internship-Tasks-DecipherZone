
interface Engine
{
    void start();
}

class PertrolEngine implements Engine
{

    @Override
    public String toString() {
        return "Petrol engine";
    }

    @Override
    public void start() {
        System.out.println("Petrol Engine Car");
    }
}

class ElectricEnginee implements Engine
{
    @Override
    public void start() {
        System.out.println("Electrical Engine car");
    }
    @Override
    public String toString() {
        return "Electric engine";
    }
}

class Carr
{
    private Engine engine;

    public void setEngine(Engine engine)
    {
        this.engine=engine;
    }

    public Engine getEngine()
    {
        return this.engine;
    }

 /*   Carr (Engine engine)
    {
        this.engine = engine;
    }*/
    void drive()
    {
        if(engine instanceof PertrolEngine)
        {
            System.out.println("Driver drive an petrol carr he is an cool men");
        }
        else {
            System.out.println("Driver drive an Electrical car");
        }
    }

}

public class H_Loose_Coupling {
    public static void main(String[] args) {


        Carr carr = new Carr();
        carr.setEngine(new PertrolEngine());
        carr.drive();


        Engine engine = carr.getEngine();
        System.out.println(engine.toString());
    }
}
