package javasesseions;

public class TestMethod {
	public void getmail()
	{
		System.out.println("getmail");
	}
	//static methods can be overloaded
	public static void setmail()
	{
		System.out.println("setmail");
	}
	public static void setmail(int a)
	{
		System.out.println("setmail");
	}
	public static void setmail(String a)
	{
		System.out.println("setmail");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethod.setmail();
		//or setmail();
		TestMethod obj=new TestMethod();
		obj.getmail();
	}

}
