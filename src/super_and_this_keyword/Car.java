package super_and_this_keyword;

public class Car {

	int speed=300;
	public Car() {
		System.out.println("no arg");
	}
public Car(int a) {
	System.out.println("single arg "+a);	
	}
	public void start()
	{
		System.out.println("carstart");
	}
	public void refuel()
	{
		System.out.println("carrefuel");
	}
}
