== and .equals diffrence

1> ==

for primitive datatype this means for checking value is equal or not like

int a = 10;
int b = 20;
sout(a==b) ; false

b = 10;
sout(a==b) ; true

for non primitve they checks refrence like

Student s1 = new Student(1,"Harshal");
Student s2 = new Student(2,"raam");
sout(s1==s2); // false becuase they are diffrent object

s2 = s1;
sout(s1==s2);   vo aise krta


2> equals

for non primtive datatype it is an method of object class bydefault its check value like

String s1 = new String("Harshal");

String s2 = new String("Harshal");

sout(s1.equals(s2)); //true


>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<,

Main diffrence between while and fro loop

Example:

for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}

Here you know:

Start → 1
End   → 10
Update → +1

So for is convenient when you know how the loop variable progresses.

while loop

while is generally preferred when the loop should continue as long as some condition remains true, and the number of iterations may not be known beforehand.

int password;

while (password != 1234) {
    password = getPassword();
}

Here you don't necessarily know:

How many attempts?