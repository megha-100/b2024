package constructorconcept;

public class Employee {
	String name;
	int age;
	char gender;
	double salary;
	boolean ispermanent;
	String dob;
	static String companyname="IBM";
/**Same Name as the Class: A constructor must have the exact same name as the class it belongs to.
No Return Type: Constructors do not have a return type, not even void.
Called Automatically: They are called implicitly when an object is instantiated.
Object Initialization: Constructors are used to set up the initial state of an object. This can involve assigning default values or values passed as parameters.
Default Constructor: If no constructor is explicitly defined in a class, the Java compiler automatically provides a default, no-argument constructor. This default constructor initializes instance variables to their default values (e.g., 0 for int, null for String, false for boolean).
No-argument (or default) constructor: Takes no parameters.
Parameterized constructor: Takes one or more parameters to initialize instance variables with specific values.
 * 
 */
	//No-argument (or default) constructor: Takes no parameters
	public Employee()
	{
		System.out.println("default constructor");
		System.out.println(Employee.companyname);
	}
	//Parameterized constructor
	public Employee(int a)
	{
		System.out.println("single arg constructor");
	}
	public Employee(String name,int age)
	{//this.global=local
		this.name=name;
		this.age=age;
	}
	public Employee(String name,int age,double salary,char gender)
	{//this.global=local
		//if the local var is same as global var then in order access the global var we have use this keyword 
		//'this' works only in object
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.salary=salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee(10);
		
		Employee e3=new Employee("megha",30);
		System.out.println("name= "+e3.name+" age= "+e3.age);
		Employee e4=new Employee("megha",30,20.89,'F');
		System.out.println("name= "+e3.name+" age= "+e3.age+" salary "+e4.salary+" gender "+e4.gender);
	}

}
