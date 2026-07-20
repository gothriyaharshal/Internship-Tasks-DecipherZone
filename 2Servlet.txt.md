Excellent question. ServletConfig and ServletContext are among the most frequently asked Servlet interview topics. Many students memorize the definitions but don't understand why they exist. Let's understand them from the basics.

First, why do we need them?

Imagine your application has two servlets:

LoginServlet

RegisterServlet

Suppose:

LoginServlet needs a database username.
Both servlets need the application's company name.

Where should you store this information?

Java provides two objects:

ServletConfig → Information for one servlet only.
ServletContext → Information shared by the entire web application.
1. ServletConfig
Definition

ServletConfig stores configuration information for a single servlet.

Each servlet gets its own ServletConfig object.

Example:

Application

├── LoginServlet
│      |
│      ---> ServletConfig
│
└── RegisterServlet
       |
       ---> ServletConfig

Notice:

Both servlets have different ServletConfig objects.

Where do we define it?

Traditionally in web.xml:

<servlet>
    <servlet-name>LoginServlet</servlet-name>
    <servlet-class>com.demo.LoginServlet</servlet-class>

    <init-param>
        <param-name>dbUser</param-name>
        <param-value>root</param-value>
    </init-param>
</servlet>
Reading it
public class LoginServlet extends HttpServlet {

    public void init(ServletConfig config)
            throws ServletException {

        super.init(config);

        String user =
                config.getInitParameter("dbUser");

        System.out.println(user);
    }
}

Output

root
Common Methods
config.getInitParameter("name");

Returns one parameter.

config.getInitParameterNames();

Returns all parameter names.

config.getServletContext();

Returns the ServletContext.

Easy Example

Suppose:

LoginServlet

Database = MySQL

RegisterServlet

Database = PostgreSQL

Each servlet has different configuration.

So each servlet has its own ServletConfig.

2. ServletContext

Now suppose every servlet needs

Company Name

Project Name

Support Email

Should you store this in every servlet?

No.

Store it once.

That's what ServletContext is for.

Definition

ServletContext contains information that is shared by the entire application.

Only one ServletContext object exists per web application.

Diagram

Web Application

            ServletContext
                 |
      -------------------------
      |           |          |
LoginServlet RegisterServlet ProductServlet

All servlets share the same context.

Define it
<context-param>

    <param-name>company</param-name>

    <param-value>OpenAI</param-value>

</context-param>
Read it
ServletContext context =
        getServletContext();

String company =
        context.getInitParameter("company");

Output

OpenAI
ServletContext Attributes

You can also store objects inside it.

ServletContext context =
        getServletContext();

context.setAttribute("message","Hello");

Another servlet

String msg =
(String)context.getAttribute("message");

Output

Hello

Every servlet can access it.

Lifecycle
ServletConfig

Created

When servlet is initialized.

Destroyed

When servlet is destroyed.
ServletContext

Created

When application starts.

Destroyed

When application stops.
ServletConfig vs ServletContext
Feature	ServletConfig	ServletContext
Scope	One servlet	Entire application
Number of objects	One per servlet	One per application
Stores	Servlet-specific configuration	Application-wide configuration
Shared?	❌ No	✅ Yes
Lifetime	Until that servlet is destroyed	Until the application stops
Typical use	Init parameters for one servlet	Global configuration, shared objects
ServletConfig vs Request vs Session vs Context
Object	Scope	Lifetime
Request	One request	Until the request finishes
Session	One user	Until timeout/logout
ServletConfig	One servlet	Until servlet is destroyed
ServletContext	Entire application	Until application stops
Real-world Example

Suppose you're building an e-commerce website.

ServletConfig
LoginServlet

↓

Captcha Enabled = true

Only LoginServlet needs this.

ServletContext
Company Name = Amazon

Support Email = support@amazon.com

Application Version = 1.0

Every servlet can access these values.

Interview Questions
1. What is ServletConfig?

Answer:
ServletConfig is a configuration object created by the servlet container for each servlet. It holds servlet-specific initialization parameters defined in the deployment descriptor (or annotations) and is available throughout that servlet's lifecycle.

2. What is ServletContext?

Answer:
ServletContext is an application-wide object created once for the entire web application. It allows all servlets to share configuration information and objects, and provides access to application resources.

3. How many ServletConfig objects are created?

If there are:

LoginServlet

RegisterServlet

ProductServlet

Then:

3 ServletConfig objects

One for each servlet.

4. How many ServletContext objects are created?

Regardless of how many servlets you have:

Only ONE

for that web application.

5. Can one servlet access another servlet's ServletConfig?

No.

Each servlet has its own ServletConfig. However, any servlet can access the shared ServletContext.

One important correction to a common misconception

Many students think ServletConfig is used to share data between servlets.

That's not its purpose.

Use ServletConfig for read-only servlet-specific configuration (like initialization parameters).
Use ServletContext to share data or configuration across the entire application.
Use HttpSession to store data for a particular user across multiple requests.
Use request.setAttribute() to pass data only during the current request (for example, from a servlet to a JSP using forward()).


#### 
If you want to master Servlets from beginner to advanced (suitable for internships, Java Full Stack jobs, and interviews), follow this roadmap.

#### 

#### 📘 Complete Servlet Syllabus

#### Module 1: Introduction to Web Technology

#### What is Web Development?

#### Static Website vs Dynamic Website

#### Client-Server Architecture

#### HTTP Protocol

#### HTTP Request \& Response

#### URL Structure

#### Web Server vs Application Server

#### What is Apache Tomcat?

#### Installing and Configuring Tomcat

#### Deploying a Web Application

#### Folder Structure of a Dynamic Web Project

#### Module 2: Introduction to Servlets

#### What is a Servlet?

#### Why do we need Servlets?

#### Servlet Lifecycle

#### GenericServlet vs HttpServlet

#### Servlet API

#### Servlet Container

#### Creating Your First Servlet

#### Deploying a Servlet

#### Running a Servlet

#### Module 3: Servlet Lifecycle (Very Important)

#### Loading

#### Instantiation

#### Initialization

#### init()

#### service()

#### destroy()

#### doGet()

#### doPost()

#### doPut()

#### doDelete()

#### When each method is called

#### Lifecycle interview questions

#### Module 4: Servlet Configuration

#### web.xml

#### Deployment Descriptor

#### <servlet>

#### <servlet-mapping>

#### Load-on-startup

#### Welcome File

#### Init Parameters

#### Context Parameters

#### Reading Parameters

#### Module 5: Servlet Annotation

#### @WebServlet

#### URL Patterns

#### Multiple URL Mapping

#### Init Parameters using Annotation

#### Annotation vs XML

#### Module 6: Request Object (HttpServletRequest)

#### Reading Form Data

#### getParameter()

#### getParameterValues()

#### getParameterMap()

#### getHeader()

#### getCookies()

#### getSession()

#### getMethod()

#### getRequestURI()

#### getContextPath()

#### getRemoteAddr()

#### getLocale()

#### Module 7: Response Object (HttpServletResponse)

#### getWriter()

#### setContentType()

#### sendRedirect()

#### setHeader()

#### addCookie()

#### sendError()

#### setStatus()

#### Download File

#### Generate HTML using Servlet

#### Module 8: Form Handling

#### HTML Form

#### GET Method

#### POST Method

#### Reading Text Field

#### Password

#### Radio Button

#### Checkbox

#### Dropdown

#### TextArea

#### Hidden Field

#### Submit Button

#### Reset Button

#### Module 9: Servlet Communication

#### RequestDispatcher

#### Forward

#### Include

#### Difference between Forward and Redirect

#### Real-world examples

#### Module 10: Session Management (Very Important)

#### Why Session Management?

#### Stateless Protocol

#### Cookies

#### URL Rewriting

#### Hidden Form Fields

#### HttpSession

#### Session Timeout

#### Session Tracking

#### Login \& Logout

#### Invalidate Session

#### Module 11: Cookies

#### Creating Cookies

#### Reading Cookies

#### Updating Cookies

#### Deleting Cookies

#### Cookie Lifetime

#### Secure Cookies

#### HttpOnly Cookies

#### Module 12: ServletContext \& ServletConfig

#### ServletConfig

#### ServletContext

#### Difference

#### Real-world examples

#### Module 13: Filters

#### What is Filter?

#### Authentication Filter

#### Logging Filter

#### Compression Filter

#### Filter Lifecycle

#### Filter Chain

#### @WebFilter

#### Module 14: Listeners

#### ServletContextListener

#### HttpSessionListener

#### ServletRequestListener

#### Attribute Listeners

#### Lifecycle Listeners

#### Module 15: Exception Handling

#### Error Pages

#### Exception Servlet

#### web.xml Error Mapping

#### Custom Error Pages

#### HTTP Status Codes

#### Module 16: File Upload \& Download

#### Multipart Form

#### Upload Image

#### Upload PDF

#### Upload Resume

#### Download Files

#### Store File in Database

#### Store File in Folder

#### Module 17: Database Connectivity (JDBC + Servlet)

#### JDBC Review

#### Driver Loading

#### Connection

#### Statement

#### PreparedStatement

#### ResultSet

#### CRUD Operations

#### Login System

#### Registration System

#### Module 18: MVC Architecture

#### What is MVC?

#### Model

#### View

#### Controller

#### Servlet as Controller

#### JSP as View

#### DAO as Model

#### Complete Flow

#### Module 19: Authentication \& Authorization

#### Login System

#### Logout

#### Role-based Login

#### Admin Panel

#### User Panel

#### Session Validation

#### Access Restriction

#### Module 20: CRUD Project

#### 

#### Build a complete project with:

#### 

#### Add Student

#### View Student

#### Update Student

#### Delete Student

#### Search Student

#### Pagination

#### Module 21: Mini Projects

#### Student Management System

#### Employee Management System

#### Library Management System

#### Online Quiz

#### Banking System

#### Hospital Management

#### Product Management

#### Module 22: Advanced Servlet Concepts

#### Servlet Thread Safety

#### Synchronization

#### Multithreading

#### Servlet Chaining

#### Asynchronous Servlet

#### Servlet Security

#### HTTPS

#### Caching

#### GZIP Compression

#### Module 23: Servlet Interview Questions

#### 100+ Interview Questions

#### Lifecycle Questions

#### Session Questions

#### Cookie Questions

#### Filter Questions

#### Listener Questions

#### JDBC + Servlet Questions

#### Real Project Questions

#### Practical Programs (Recommended)

--------#### 

#### By the time you finish, you should have built these programs:

#### 

#### Hello World Servlet

#### Login Form

#### Registration Form

#### Student CRUD

#### Employee CRUD

#### Cookie Demo

#### Session Demo

#### Login with Session

#### Logout

#### Authentication Filter

#### Visitor Counter

#### File Upload

#### File Download

#### Profile Update

#### Search Records

#### Pagination

#### Forgot Password

#### Admin Dashboard

#### User Dashboard

#### Complete Student Management System

#### Learning Order (Recommended)

#### Web Basics

#### HTTP Protocol

#### Tomcat

#### First Servlet

#### Servlet Lifecycle

#### Request \& Response

#### HTML Forms

#### RequestDispatcher

#### Session Management

#### Cookies

#### ServletConfig \& ServletContext

#### Filters

#### Listeners

#### JDBC Integration

#### File Upload/Download

#### MVC Architecture

#### Authentication \& Authorization

#### CRUD Project

#### Advanced Concepts

#### Interview Preparation

#### 

#### This roadmap covers everything from the fundamentals to the concepts typically expected in Java Full Stack development and servlet-based intervie

