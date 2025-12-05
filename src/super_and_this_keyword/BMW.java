package super_and_this_keyword;

public class BMW extends Car
{
	int speed=300;
	//super
	//Accessing Parent Class Methods: If the subclass wants to access the methods of the parent class, it can also be done with the help of the super keyword.
	//Accessing Parent Class Fields: Fields from the parent class can also be accessed using the super keyword in the subclass.
	@Override
	public void start()
	{
		super.start();
		System.out.println("BMWstart");
	}
	public void autoparking()
	{
		System.out.println("autoparking");
		System.out.println("parentspeed "+super.speed+"chilsspeed "+speed);
	}

}
