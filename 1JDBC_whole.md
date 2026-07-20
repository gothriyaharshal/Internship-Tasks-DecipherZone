### Excellent question. This is one of the most important concepts in JDBC interviews. I'll explain it like you're 10 years old.

### 

### First understand what SQL Injection actually is

### 

### Imagine you have a database table.

### 

### Users

### 

### username	password

### Harshal	1234

### Rahul	abcd

### 

### Suppose your login program is

### 

### String username = "Harshal";

### String password = "1234";

### 

### The SQL query should become

### 

### SELECT \* FROM users

### WHERE username='Harshal'

### AND password='1234';

### 

### Everything is fine.

### 

### Case 1 : Using Statement (Danger)

### 

### Suppose you write

### 

### String sql =

### "SELECT \* FROM users WHERE username='"

### \+ username +

### "' AND password='"

### \+ password +

### "'";

### 

### Statement st = con.createStatement();

### ResultSet rs = st.executeQuery(sql);

### 

### Notice something.

### 

### You are creating the SQL query yourself by joining strings.

### 

### Let's see what happens.

### 

### Normal User

### 

### Input

### 

### Username : Harshal

### Password : 1234

### 

### SQL becomes

### 

### SELECT \* FROM users

### WHERE username='Harshal'

### AND password='1234';

### 

### Correct.

### 

### Hacker

### 

### Suppose hacker enters

### 

### Username

### 

### ' OR '1'='1

### 

### Password

### 

### anything

### 

### Now Java creates

### 

### SELECT \* FROM users

### WHERE username=''

### OR '1'='1'

### AND password='anything';

### 

### Since

### 

### '1'='1'

### 

### is always TRUE,

### 

### Database thinks

### 

### WHERE TRUE

### 

### which means

### 

### Return every user.

### 

### The hacker logs in without knowing any password.

### 

### This is SQL Injection.

### 

### But why does Statement allow this?

### 

### Because Statement receives only one thing:

### 

### A complete SQL String.

### 

### For Statement

### 

### String sql =

### "SELECT \* FROM users WHERE username='" + username + "'";

### 

### After Java joins everything,

### 

### Statement receives

### 

### SELECT \* FROM users WHERE username='' OR '1'='1'

### 

### Database cannot know

### 

### which part is SQL

### which part came from the user

### 

### It simply executes everything.

### 

### Think of Statement like this

### 

### User Input

### &#x20;     ↓

### Java joins strings

### &#x20;     ↓

### Complete SQL Query

### &#x20;     ↓

### Database executes it

### 

### Everything is mixed together.

### 

### PreparedStatement

### 

### Now look at PreparedStatement.

### 

### String sql =

### "SELECT \* FROM users WHERE username=? AND password=?";

### 

### Notice something.

### 

### The query is already complete.

### 

### Only values are missing.

### 

### Database first receives

### 

### SELECT \* FROM users

### WHERE username=?

### AND password=?

### 

### Database compiles this query.

### 

### It understands

### 

### username -> value

### 

### password -> value

### 

### No SQL code is expected here.

### 

### Then Java sends values separately.

### 

### ps.setString(1, username);

### ps.setString(2, password);

### 

### Suppose hacker enters

### 

### ' OR '1'='1

### 

### Database DOES NOT put this inside SQL syntax.

### 

### Instead it treats it as

### 

### A normal string.

### 

### Like

### 

### username

### 

### =

### "' OR '1'='1"

### 

### Not as SQL code.

### 

### So the database searches for a username literally equal to

### 

### ' OR '1'='1

### 

### Since nobody has that username,

### 

### No rows found.

### 

### Injection fails.

### 

### 

### >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

### 

### Perfect! Let's first write CRUD operations using Statement only. We'll use a simple student table.

### 

### Database Table

### CREATE TABLE student (

### &#x20;   id INT PRIMARY KEY,

### &#x20;   name VARCHAR(100),

### &#x20;   age INT,

### &#x20;   course VARCHAR(100)

### );

### 1\. Database Connection

### import java.sql.Connection;

### import java.sql.DriverManager;

### import java.sql.Statement;

### import java.sql.ResultSet;

### 

### public class DBConnection {

### 

### &#x20;   static final String URL = "jdbc:mysql://localhost:3306/studentdb";

### &#x20;   static final String USER = "root";

### &#x20;   static final String PASSWORD = "root";

### 

### &#x20;   public static Connection getConnection() throws Exception {

### 

### &#x20;       Class.forName("com.mysql.cj.jdbc.Driver");

### 

### &#x20;       Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

### 

### &#x20;       return con;

### &#x20;   }

### }

### 2\. CREATE (Insert)

### import java.sql.Connection;

### import java.sql.Statement;

### 

### public class InsertStudent {

### 

### &#x20;   public static void main(String\[] args) {

### 

### &#x20;       try {

### 

### &#x20;           Connection con = DBConnection.getConnection();

### 

### &#x20;String sql = "INSERT INTO student VALUES(101,'Harshal',22,'Java')";





### &#x20;           Statement st = con.createStatement();

### 

### &#x20;           int rows = st.executeUpdate(sql);

### 

### &#x20;           System.out.println(rows + " Row Inserted");

### 

### &#x20;           st.close();

### &#x20;           con.close();

### 

### &#x20;       } catch (Exception e) {

### &#x20;           e.printStackTrace();

### &#x20;       }

### 

### &#x20;   }

### }

### Output

### 1 Row Inserted

### 3\. READ (Select)

### import java.sql.Connection;

### import java.sql.ResultSet;

### import java.sql.Statement;

### 

### public class ReadStudent {

### 

### &#x20;   public static void main(String\[] args) {

### 

### &#x20;       try {

### 

### &#x20;           Connection con = DBConnection.getConnection();

### 

### &#x20;           Statement st = con.createStatement();

### 

### &#x20;           String sql = "SELECT \* FROM student";

### 

### &#x20;           ResultSet rs = st.executeQuery(sql);

### 

### &#x20;           while (rs.next()) {

### 

### &#x20;               System.out.println("ID : " + rs.getInt("id"));

### &#x20;               System.out.println("Name : " + rs.getString("name"));

### &#x20;               System.out.println("Age : " + rs.getInt("age"));

### &#x20;               System.out.println("Course : " + rs.getString("course"));

### &#x20;               System.out.println("----------------------");

### 

### &#x20;           }

### 

### &#x20;           rs.close();

### &#x20;           st.close();

### &#x20;           con.close();

### 

### &#x20;       } catch (Exception e) {

### &#x20;           e.printStackTrace();

### &#x20;       }

### 

### &#x20;   }

### }

### 4\. UPDATE

### import java.sql.Connection;

### import java.sql.Statement;

### 

### public class UpdateStudent {

### 

### &#x20;   public static void main(String\[] args) {

### 

### &#x20;       try {

### 

### &#x20;           Connection con = DBConnection.getConnection();

### 

### &#x20;           Statement st = con.createStatement();

### 

### &#x20;           String sql = "UPDATE student SET course='Spring Boot' WHERE id=101";

### 

### &#x20;           int rows = st.executeUpdate(sql);

### 

### &#x20;           System.out.println(rows + " Row Updated");

### 

### &#x20;           st.close();

### &#x20;           con.close();

### 

### &#x20;       } catch (Exception e) {

### &#x20;           e.printStackTrace();

### &#x20;       }

### 

### &#x20;   }

### }

### Output

### 1 Row Updated

### 5\. DELETE

### import java.sql.Connection;

### import java.sql.Statement;

### 

### public class DeleteStudent {

### 

### &#x20;   public static void main(String\[] args) {

### 

### &#x20;       try {

### 

### &#x20;           Connection con = DBConnection.getConnection();

### 

### &#x20;           Statement st = con.createStatement();

### 

### &#x20;           String sql = "DELETE FROM student WHERE id=101";

### 

### &#x20;           int rows = st.executeUpdate(sql);

### 

### &#x20;           System.out.println(rows + " Row Deleted");

### 

### &#x20;           st.close();

### &#x20;           con.close();

### 

### &#x20;       } catch (Exception e) {

### &#x20;           e.printStackTrace();

### &#x20;       }

### 

### &#x20;   }

### }

### Output

### 1 Row Deleted

### How Statement becomes vulnerable

### 

### The previous examples are hard-coded, so they are not vulnerable. The real problem starts when SQL is built using user input.

### 

### import java.sql.Connection;

### import java.sql.ResultSet;

### import java.sql.Statement;

### import java.util.Scanner;

### 

### public class LoginUsingStatement {

### 

### &#x20;   public static void main(String\[] args) {

### 

### &#x20;       Scanner sc = new Scanner(System.in);

### 

### &#x20;       System.out.print("Enter Username : ");

### &#x20;       String username = sc.nextLine();

### 

### &#x20;       System.out.print("Enter Password : ");

### &#x20;       String password = sc.nextLine();

### 

### &#x20;       try {

### 

### &#x20;           Connection con = DBConnection.getConnection();

### 

### &#x20;           Statement st = con.createStatement();

### 

### &#x20;           String sql = "SELECT \* FROM users WHERE username='"

### &#x20;                   + username

### &#x20;                   + "' AND password='"

### &#x20;                   + password

### &#x20;                   + "'";

### 

### &#x20;           System.out.println("Generated SQL:");

### &#x20;           System.out.println(sql);

### 

### &#x20;           ResultSet rs = st.executeQuery(sql);

### 

### &#x20;           if (rs.next()) {

### &#x20;               System.out.println("Login Successful");

### &#x20;           } else {

### &#x20;               System.out.println("Invalid User");

### &#x20;           }

### 

### &#x20;           rs.close();

### &#x20;           st.close();

### &#x20;           con.close();

### 

### &#x20;       } catch (Exception e) {

### &#x20;           e.printStackTrace();

### &#x20;       }

### &#x20;   }

### }

### Normal input

### Username : Harshal

### Password : 1234

### 

### Generated SQL:

### 

### SELECT \* FROM users

### WHERE username='Harshal'

### AND password='1234';

### Hacker input

### Username : ' OR '1'='1

### Password : anything

### 

### Generated SQL:

### 

### SELECT \* FROM users

### WHERE username=''

### OR '1'='1'

### AND password='anything';

### 

### Because '1'='1' is always true, the query's logic can be manipulated. This is the essence of SQL Injection when using Statement with string concatenation.

### 

### In the next step, we'll write the same CRUD operations using PreparedStatement and you'll see exactly how it prevents this problem while using almost the same code structure.

### 

### >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

### 

### Prepared statement

### >>

### 

### We'll use the same student table:

### 

### CREATE TABLE student (

### &#x20;   id INT PRIMARY KEY,

### &#x20;   name VARCHAR(100),

### &#x20;   age INT,

### &#x20;   course VARCHAR(100)

### );

### 1\. Database Connection

### import java.sql.Connection;

### import java.sql.DriverManager;

### 

### public class DBConnection {

### 

### &#x20;   static final String URL = "jdbc:mysql://localhost:3306/studentdb";

### &#x20;   static final String USER = "root";

### &#x20;   static final String PASSWORD = "root";

### 

### &#x20;   public static Connection getConnection() throws Exception {

### 

### &#x20;       Class.forName("com.mysql.cj.jdbc.Driver");

### 

### &#x20;       return DriverManager.getConnection(URL, USER, PASSWORD);

### &#x20;   }

### }

### 2\. CREATE (Insert)

### import java.sql.Connection;

### import java.sql.PreparedStatement;

### 

### public class InsertStudent {

### 

### &#x20;   public static void main(String\[] args) {

### 

### &#x20;       try {

### 

### &#x20;           Connection con = DBConnection.getConnection();

### 

### &#x20;           String sql = "INSERT INTO student(id,name,age,course) VALUES(?,?,?,?)";

### 

### &#x20;           PreparedStatement ps = con.prepareStatement(sql);

### 

### &#x20;           ps.setInt(1, 101);

### &#x20;           ps.setString(2, "Harshal");

### &#x20;           ps.setInt(3, 22);

### &#x20;           ps.setString(4, "Java");

### 

### &#x20;           int rows = ps.executeUpdate();

### 

### &#x20;           System.out.println(rows + " Row Inserted");

### 

### &#x20;           ps.close();

### &#x20;           con.close();

### 

### &#x20;       } catch (Exception e) {

### &#x20;           e.printStackTrace();

### &#x20;       }

### 

### &#x20;   }

### }

### Output

### 1 Row Inserted

### 3\. READ (Select)

### import java.sql.Connection;

### import java.sql.PreparedStatement;

### import java.sql.ResultSet;

### 

### public class ReadStudent {

### 

### &#x20;   public static void main(String\[] args) {

### 

### &#x20;       try {

### 

### &#x20;           Connection con = DBConnection.getConnection();

### 

### &#x20;           String sql = "SELECT \* FROM student WHERE id=?";

### 

### &#x20;           PreparedStatement ps = con.prepareStatement(sql);

### 

### &#x20;           ps.setInt(1, 101);

### 

### &#x20;           ResultSet rs = ps.executeQuery();

### 

### &#x20;           while (rs.next()) {

### 

### &#x20;               System.out.println("ID : " + rs.getInt("id"));

### &#x20;               System.out.println("Name : " + rs.getString("name"));

### &#x20;               System.out.println("Age : " + rs.getInt("age"));

### &#x20;               System.out.println("Course : " + rs.getString("course"));

### &#x20;               System.out.println("----------------------");

### 

### &#x20;           }

### 

### &#x20;           rs.close();

### &#x20;           ps.close();

### &#x20;           con.close();

### 

### &#x20;       } catch (Exception e) {

### &#x20;           e.printStackTrace();

### &#x20;       }

### 

### &#x20;   }

### }

### 4\. UPDATE

### import java.sql.Connection;

### import java.sql.PreparedStatement;

### 

### public class UpdateStudent {

### 

### &#x20;   public static void main(String\[] args) {

### 

### &#x20;       try {

### 

### &#x20;           Connection con = DBConnection.getConnection();

### 

### &#x20;           String sql = "UPDATE student SET course=? WHERE id=?";

### 

### &#x20;           PreparedStatement ps = con.prepareStatement(sql);

### 

### &#x20;           ps.setString(1, "Spring Boot");

### &#x20;           ps.setInt(2, 101);

### 

### &#x20;           int rows = ps.executeUpdate();

### 

### &#x20;           System.out.println(rows + " Row Updated");

### 

### &#x20;           ps.close();

### &#x20;           con.close();

### 

### &#x20;       } catch (Exception e) {

### &#x20;           e.printStackTrace();

### &#x20;       }

### 

### &#x20;   }

### }

### Output

### 1 Row Updated

### 5\. DELETE

### import java.sql.Connection;

### import java.sql.PreparedStatement;

### 

### public class DeleteStudent {

### 

### &#x20;   public static void main(String\[] args) {

### 

### &#x20;       try {

### 

### &#x20;           Connection con = DBConnection.getConnection();

### 

### &#x20;           String sql = "DELETE FROM student WHERE id=?";

### 

### &#x20;           PreparedStatement ps = con.prepareStatement(sql);

### 

### &#x20;           ps.setInt(1, 101);

### 

### &#x20;           int rows = ps.executeUpdate();

### 

### &#x20;           System.out.println(rows + " Row Deleted");

### 

### &#x20;           ps.close();

### &#x20;           con.close();

### 

### &#x20;       } catch (Exception e) {

### &#x20;           e.printStackTrace();

### &#x20;       }

### 

### &#x20;   }

### }

### Output

### 1 Row Deleted

### Login Example (Safe from SQL Injection)

### import java.sql.Connection;

### import java.sql.PreparedStatement;

### import java.sql.ResultSet;

### import java.util.Scanner;

### 

### public class LoginUsingPreparedStatement {

### 

### &#x20;   public static void main(String\[] args) {

### 

### &#x20;       Scanner sc = new Scanner(System.in);

### 

### &#x20;       System.out.print("Enter Username : ");

### &#x20;       String username = sc.nextLine();

### 

### &#x20;       System.out.print("Enter Password : ");

### &#x20;       String password = sc.nextLine();

### 

### &#x20;       try {

### 

### &#x20;           Connection con = DBConnection.getConnection();

### 

### &#x20;           String sql =

### &#x20;               "SELECT \* FROM users WHERE username=? AND password=?";

### 

### &#x20;           PreparedStatement ps = con.prepareStatement(sql);

### 

### &#x20;           ps.setString(1, username);

### &#x20;           ps.setString(2, password);

### 

### &#x20;           ResultSet rs = ps.executeQuery();

### 

### &#x20;           if (rs.next()) {

### &#x20;               System.out.println("Login Successful");

### &#x20;           } else {

### &#x20;               System.out.println("Invalid User");

### &#x20;           }

### 

### &#x20;           rs.close();

### &#x20;           ps.close();

### &#x20;           con.close();

### 

### &#x20;       } catch (Exception e) {

### &#x20;           e.printStackTrace();

### &#x20;       }

### &#x20;   }

### }

### What if a hacker enters?

### 

### Username

### 

### ' OR '1'='1

### 

### Password

### 

### anything

### 

### The SQL template does not change:

### 

### SELECT \* FROM users

### WHERE username=?

### AND password=?;

### 

### The values are sent separately:

### 

### ps.setString(1, "' OR '1'='1");

### ps.setString(2, "anything");

### 

### The database treats "' OR '1'='1" as plain text, not as SQL code. It simply searches for a username that literally contains those characters.

### 

### Comparison

### Statement	PreparedStatement

### Uses Statement	Uses PreparedStatement

### SQL is built by concatenating strings	SQL contains ? placeholders

### User input becomes part of the SQL query	User input is bound as parameters

### Vulnerable to SQL Injection	Safe from SQL Injection (when used correctly)

### SQL is parsed each time	SQL can be parsed once and reused

### Slightly faster for one-off static queries	Usually better for repeated queries

### What we'll cover next

### 

### Now that you've seen both CRUD implementations, the next topic is the internal working of PreparedStatement—how the JDBC driver, database parser, and parameter binding work behind the scenes. Understanding that will make it completely clear why SQL injection is prevented.

