package accmod1;

public class Bmw extends Car{
	@Override
	protected void billing()
	{
		//for overriding access modifier should be same or higher in child class
		System.out.println("bmw billing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bmw b=new Bmw();
		//pakage private,protected,public
		//pakage private-only within the package
		b.colour="blue";
		b.name="byu";
		b.price=688;

	}

}
