package javasesseions;

public class Car {

	String name;
	double price;
	String chasino;
	static final int wheel=4;//single copy constant var
	//static and non static concept is applicable only for global var 
	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.name="njs";
		c1.price=29.33;
		c1.chasino="n3";
		System.out.println(c1.name+" "+c1.price+" "+c1.chasino+" "+Car.wheel);
		//Car.wheel=3;
		Car c2=new Car();
		c2.name="ljs";
		c2.price=19.33;
		c2.chasino="n4";
		System.out.println(c2.name+" "+c2.price+" "+c2.chasino+" "+Car.wheel);
		
		Car c3=new Car();
		c3.name="ffjs";
		c3.price=39.33;
		c3.chasino="n5";
		System.out.println(c3.name+" "+c3.price+" "+c3.chasino+" "+Car.wheel);

	}
	
	
}
