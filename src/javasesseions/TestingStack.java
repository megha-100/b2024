package javasesseions;

public class TestingStack {
	//stackoverflow
	public void test1()
	{
		System.out.println("test1");
		test2();
	}
	public void test2()//2 arguments
	{
		System.out.println("test2");
		test3();
	}
	public void test3()
	{
		System.out.println("test3");
		//test1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestingStack obj=new TestingStack();
		obj.test1();
	}

}
