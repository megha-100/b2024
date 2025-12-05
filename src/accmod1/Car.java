package accmod1;

public class Car {
	//at class level-only public , pack private,abstract ,final are allowed
	String name;
	public int price;
	protected String colour;
	private String chasisno;
	protected void billing()
	{
		System.out.println("car billing");
	}
	//public>protected>pack private>private

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		//protected constructor cannot be accessed in child class of different pkg
		//private
		c.chasisno="123";

	}

}
