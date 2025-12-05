package javasesseions;

public class MethodChaining {
	public void test1()//different datatypes
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
		MethodChaining.t1();
	}
	public static void t1()
	{
		System.out.println("t1");
		t2();
	}
	public static void t2()
	{
		System.out.println("t2");
		t3();
	}
	public static void t3()
	{
		System.out.println("t3");
	}
	/**static-static-directly
	 * non static-non static-directly
	 * static- non static-creating obj
	 *  non static-static-using classname
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodChaining obj=new MethodChaining();
		obj.test1();
	}

}
