package accmod2;


import accmod1.Car;


public class Audi extends Car{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi b=new Audi();
		//only public and protected are visible
		//protected-only child class from different package also can access
		b.colour="pink";
		b.price=56;
		

	}

}
