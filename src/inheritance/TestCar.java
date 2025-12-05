package inheritance;
/**
 * Method overriding in Java is a feature that allows a subclass to provide a specific implementation for a method that is already defined in its superclass. This is a core concept of runtime polymorphism in object-oriented programming. 
Key characteristics and rules of method overriding:
Inheritance: Method overriding can only occur within an inheritance hierarchy, meaning there must be a superclass-subclass relationship.
Same Signature: The overriding method in the subclass must have the exact same method signature (name, number and type of parameters, and order of parameters) as the method in the superclass.
Same or Covariant Return Type: The overriding method must have the same return type or a covariant return type (a subtype of the superclass method's return type).
Access Modifier: The access modifier of the overriding method in the subclass must be the same or more accessible than that of the overridden method in the superclass. For example, if the superclass method is protected, the subclass method can be protected or public, but not private.
Exceptions: The overriding method can declare fewer or the same checked exceptions as the overridden method, or it can declare no checked exceptions. It cannot declare new, broader checked exceptions.
Cannot Override final Methods: Methods declared with the final keyword in the superclass cannot be overridden.
Cannot Override static Methods: static methods belong to the class, not an object, and therefore cannot be overridden. They can be hidden by a static method in the subclass with the same signature, but this is not overriding.
Cannot Override private Methods: private methods are not accessible outside their class and thus cannot be overridden.
 */
//only the properties and methods can be inherited
//whenever a object of child is created a default constructor of child class is called in that we have super()(constructor of parent class),
//hence multiple Inheritance is not possible in class
//multi-level Inheritance
class vehicle
{
	public void engine()
	{
		System.out.println("vehicleeng");
	}
}
//final class-to prevent inheritance
class Car extends vehicle
{
	public void start()
	{
		System.out.println("start");
		refuel();
	}
	  public final void stop()
	{
		System.out.println("stop");
		
	}
	//final Methods cannot be override but can be inherited
	  private  void refuel()
	{
		System.out.println("refuel");
	}
	
}
//hierechial Inheritance
class BMW extends Car
{
	//redefining the same method in child class - Method overriding-run time polymorphism(JVM)
	public void engine()
	{
		System.out.println("bmweng");
	}
	@Override
	public void start()
	{
		System.out.println("bmwstart");
	}
	public void autokey()
	{
		System.out.println("autokey");
	}
	public static void brake()
	{
		System.out.println("brake");
	}
}
class Audi extends Car
{
	//redefining the same method in child class - Method overriding-run time polymorphism(JVM)
	@Override
	public void start()
	{
		System.out.println("audistart");
	}
	public void theftsafe()
	{
		System.out.println("theftsafe");
	}
	
}


public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b=new BMW();
		b.start();//@Override
		b.stop();//inherited
		b.autokey();//individual
		BMW.brake();
		b.engine();//Override
		System.out.println("----");
		Car c=new Car();
		c.start();
		c.stop();	
		c.engine();//inherited
		System.out.println("----");
		Audi a=new Audi();
		a.start();//@Override
		a.stop();//inherited
		a.theftsafe();//individual
		System.out.println("----");
		vehicle v=new vehicle();
		v.engine();
		//upcasting-converting child object to parent type
		System.out.println("----");
		Car c1 = new BMW();
		c1.start();//Override
		c1.stop();//inherited
		c1.engine();//Override
		System.out.println("----");
		Car c2=new Audi();
		c2.engine();//in
		c2.start();//override
		c2.stop();//in
	//downcasting-converting upcasted object back to child type explicitly
		Audi b1 = (Audi)c1;
	}

}
