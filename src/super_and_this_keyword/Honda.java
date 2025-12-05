package super_and_this_keyword;

public class Honda {
	public Honda()
	{
		this(10);//it should be first statement
		System.out.println("default constr");
	}

	public Honda(int a) {
		this(10,20);
		System.out.println("single arg const"+a);
	}
	public Honda(int a,int b) {
		
		System.out.println("parameterized const "+(a+b));
	}
	

}
