public class Converting_UserDefined_array_Into_List {
    public static void main(String[] args) {

        Student[] arr = new Student[3];
        arr = new Student(1,"Harsal");
       /* arr = new Student(2,"Jerry");
        arr = new Student(3,"merry");
*/
        for(Student s : arr)
        {
            System.out.println(s);
        }
    }
}

class Student
{
    int id ;
    String name ;

    Student(int id , String name)
    {
        this.id = id ;
        this.name = name ;
    }

}