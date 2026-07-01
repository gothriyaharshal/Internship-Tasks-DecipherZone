class Parent
{
    public  Object getData()
    {
        System.out.println("Getting data");
        return null;
    }
}

public class Covarient_Overloading extends Parent{

    /*before java 5 there must be same return type in overriding but after
    we also use covarient type also

            like in parent class there has Obejct return type in child class
    we use either Object or either Integer String like child of it

    */

        public  Integer getData()
        {
            System.out.println("Covarient type");
            return 1;
        }
        public static void main(String[] args) {
            Parent p = new Covarient_Overloading();
            p.getData();

        }


}