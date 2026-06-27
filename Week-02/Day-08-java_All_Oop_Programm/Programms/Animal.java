Tight Coupling portion where if i want to create diffrent type of car which gonna be made from diffrent egine then i have to create many class and many engine 


class PetrolEngine {

    void start() {
        System.out.println("Petrol engine started");
    }
}

class ElectricEngine {

    void start() {
        System.out.println("Electric engine started");
    }
}


class PetrolCar {

    PetrolEngine engine = new PetrolEngine();  // tight coupling

    void drive() {
        engine.start();
        System.out.println("Petrol car is running");
    }
}


class ElectricCar {

    ElectricEngine engine = new ElectricEngine(); // tight coupling

    void drive() {
        engine.start();
        System.out.println("Electric car is running");
    }
}


public class Main {

    public static void main(String[] args) {

        PetrolCar car1 = new PetrolCar();
        car1.drive();

        ElectricCar car2 = new ElectricCar();
        car2.drive();
    }
}

>>>>>>

But in loose coupling i create only one car class and one engine inteface ....and makes diffrenct classes of Engine that i want like 

i want pertrolEngine then i extend Engine interface our there and 
implements method and if i want electricEngine then also do same

and passes in its constructor




