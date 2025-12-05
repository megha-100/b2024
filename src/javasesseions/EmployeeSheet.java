package javasesseions;

public class EmployeeSheet {
	//method overloading-compile time polymorphism
	//same method name with different signature,irrespective of return type and access modifier(any)
	//different signature-different (no of arguments,order of arguments,datatypes of arguments)
	//ex -search,filter,payment,uber car booking,calculator,calculate tax
	//used to perform similar functions
	public int test()//0 arguments
	{
		System.out.println("test1");
		return 90;
	}
	public double test(int a)//1 arguments
	{
		System.out.println("test2");
		return 90.89;
	}
	public void test(String a)//different datatypes
	{
		System.out.println("test3");
		
	}
	public int test(String a,int b)//2 arguments
	{
		System.out.println("test3");
		return 90;
	}
	public int test(int b,String a)
	{
		System.out.println("test4");
		return 90;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSheet e=new EmployeeSheet();
		System.out.println(e.test(90));
	}

}
