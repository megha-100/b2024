package Interface;

abstract class Page {
	Page()
	{
		System.out.println("page");
	}
	
	public abstract void title();
	public abstract void url();
	//non abstract
	
	public void loading()
	{
		System.out.println("loading");
	}
	public static void header()
	{
		System.out.println("header");
	}
	

}
class LoginPage extends Page
{
	LoginPage()
	{
		//it will internally call super()
		System.out.println("loginPage");
	}
	LoginPage(int a)
	{
		//the first statement is always super()
		//it will internally call super()
		System.out.println("loginPage "+a);
	}
	//if we want to call parameterized constructor of superclass we should explicitly call super(arg);
//super(arg);-this should be 1st statement in child class constructor
	@Override
	public void title() {
		// TODO Auto-generated method stub
		System.out.println("logintitle");
	}

	@Override
	public void url() {
		// TODO Auto-generated method stub
		System.out.println("url");
	}
	
}
/**
 * An abstract class is a class that cannot be instantiated directly, meaning an object of an abstract class cannot be created. It serves as a blueprint for other classes, providing a common structure and potentially some implemented functionality, while leaving certain methods to be implemented by its subclasses. 
Key characteristics of an abstract class:
Cannot be instantiated: You cannot create an object directly from an abstract class. 
Can contain abstract methods: These are methods declared without an implementation (no method body). Subclasses are required to provide the implementation for these abstract methods. If a class contains at least one abstract method, it must be declared as an abstract class. 
Can contain concrete methods: Abstract classes can also include regular methods with full implementations, which can be inherited and used by subclasses.
Can have fields, constructors, and other members: Similar to regular classes, abstract classes can define member variables, constructors (used when a subclass is instantiated), and other class members.
Inheritance: Abstract classes are designed to be extended by other classes using keywords like extends (in Java) or through inheritance in other object-oriented languages.
Polymorphism: Abstract classes support polymorphism, allowing you to use a reference of the abstract class type to refer to objects of its concrete subclasses.




Key points about super():
Constructor Invocation: super() is specifically for calling a superclass constructor.
First Statement: A call to super() (or super(arguments)) must be the very first statement within a subclass constructor.
Implicit Call: If a subclass constructor does not explicitly call a superclass constructor using super(),
 Java automatically inserts an implicit call to the superclass's no-argument constructor (super();) as the first statement.
Parameterized Constructors: To invoke a specific parameterized constructor of the superclass, 
super() must be called with the appropriate arguments, for example, super(arg1, arg2);.
No-args Constructor Requirement: If a superclass only has parameterized constructors and 
no no-argument constructor, then any subclass constructor must explicitly call one of the superclass's parameterized constructors
 using super(arguments); to avoid a compilation error.
 */
public class TestPage {

	public static void main(String[] args) {
		LoginPage l=new LoginPage();
		LoginPage l1=new LoginPage(10);
		l.loading();//inher
		l.title();//override
		l.url();//override
		Page.header();//static
		Page p=new LoginPage();
		p.loading();
				
		
	}
	
	}

