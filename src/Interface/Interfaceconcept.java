package Interface;
class Medical
{


}
interface who
{
	void covidvac(); 
}
interface Ukhosptial extends who
{
	// public abstract methods-generally nonstatic method and with only header
	void neurofun();
	void emergency();
	//static methods cannot be inherited
	public static void billing()
	{
		System.out.println("billing");
	}
	//for nonstatic concrete methods use default keyword
	default void mi()
	{
		System.out.println("mi");
	}
}
interface Ushosptial extends who
{
	int minfee=10;
	void cardiofun();
	void emergency();
	default void mi()
	{
		System.out.println("mi");
	}
}
interface indiahosptial extends who
{
	void dermofun();
	void emergency();
}

class hospital extends Medical implements Ukhosptial,Ushosptial,indiahosptial
{
	
	
	@Override
	public void mi()
	{
		Ukhosptial.super.mi();
		System.out.println("hmi");
	}

	@Override
	public void dermofun() {
		// TODO Auto-generated method stub
		System.out.println("dermofun");
		
	}

	@Override
	public void cardiofun() {
		// TODO Auto-generated method stub
		System.out.println("cardiofun");
	}

	@Override
	public void neurofun() {
		// TODO Auto-generated method stub
		System.out.println("neurofun");
	}

	@Override
	public void emergency() {
		// TODO Auto-generated method stub
		System.out.println("emergency");
	}
	public void bed()
	{
		System.out.println("bed");
	}

	@Override
	public void covidvac() {
		// TODO Auto-generated method stub
		System.out.println("covidvac");
	}
	
}

public class Interfaceconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hospital h=new hospital();
		h.bed();//individual
		h.cardiofun();//us
		h.dermofun();//india
		h.emergency();//common in all hospital
		h.neurofun();//uk hospital
		
	/**	An interface in Java is a blueprint of a class, used to achieve abstraction and support multiple inheritance. It defines a contract that classes must adhere to.
		Key Characteristics of Interfaces:
		Abstraction: Interfaces contain abstract methods, which are declared without an implementation (method body). Any class implementing an interface must provide concrete implementations for all its abstract methods. This enforces a specific behavior for implementing classes without dictating the internal details.
		Multiple Inheritance: Java does not support direct multiple inheritance of classes, but it allows a class to implement multiple interfaces. This enables a class to inherit behaviors from various sources, achieving a form of multiple inheritance.
		Constants: Interfaces can declare static and final variables, which are effectively constants. These are implicitly public, static, and final.
		Declaration: Interfaces are declared using the interface keyword.
		Implementation: Classes implement interfaces using the implements keyword. A class can implement multiple interfaces by separating them with commas.
No instantiation: You cannot create an instance of an interface directly.
Default and Static Methods (Java 8+): Since Java 8, interfaces can also include default methods with implementations and static methods. Default methods provide a way to add new methods to an interface without breaking existing implementing classes,
 while static methods are utility methods related to the interface.

	}**/
		//top casting
		Ukhosptial uk = new hospital();
		uk.emergency();
		uk.neurofun();
		//down casting
		//h=(hospital)uk;
		Ukhosptial.billing();
		h.mi();//override

		
		
	
	
	}

}
