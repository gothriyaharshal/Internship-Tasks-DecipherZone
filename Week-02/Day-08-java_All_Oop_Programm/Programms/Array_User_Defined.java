import java.util.*;

        public class Array_User_Defined {

            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter how many Users you want");
            int n  = scanner.nextInt();

            Users[] arr = new Users[n];

            for (int i = 0 ; i<arr.length ; i++)
            {
                System.out.println("Enter your " + i +"th id which you want to store");
                int id = scanner.nextInt();

                scanner.nextLine();

                System.out.println("Enter your name in this id");
                String str = scanner.nextLine();

                arr[i]=new Users(id,str);
            }

            for(int i = 0 ; i<arr.length ; i++)
            {
                System.out.print(arr[i].getId()+"--------------->"+arr[i].getName());
            }
            for (Object object : arr)
            {
                System.out.println(object);
            }
        }
    }

    class Users
    {
        private int id;
        private String name;

        Users(int id , String name)
        {
            this.id = id;
            this.name = name;
        }

        public int getId()
        {
            return this.id;
        }
        public void setId(int id)
        {
            this.id=id;
        }

        public String getName()
        {
            return this.name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        @Override
        public String toString() {
            return "your id is--> " + this.id + " and your name is--> " + this.name;
        }
    }


