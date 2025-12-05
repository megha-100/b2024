package javasesseions;

public class FunctionsInJava {
	//noinput noreturn
	public void test()
	{
		System.out.println("test method");
	}
	//noinputreturn
	public int getNumber()
	{
		System.out.println("getNumber");
		int c=10+20;
		return c;
	}

	public String getName()
	{
		System.out.println("getName");
		
		return "Naveen";
	}
	public boolean checkinguserstatus()
	{
		System.out.println("checkinguserstatus");
	
		return true;
	}
	//someinput noreturn
	//void with return also possible
	public void addNumber(int a,int b)//arguments must be a variables
	{
		int sum=a+b;
		System.out.println(sum);
		return;
	}
	//someinput somereturn
		public int multiply(int a,int b)//arguments must be a variables
		{
			int mul=a*b;
			return mul;
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionsInJava obj=new FunctionsInJava();
		obj.test();
		int num=obj.getNumber();
		System.out.println(num);
		boolean flag = obj.checkinguserstatus();
		System.out.println(flag);
		obj.addNumber(10, 20);
		int a=90;
		obj.addNumber(a, 30);//we can pass variables also and numbers also
		int c = obj.multiply(10, 12);
		System.out.println(c);
		
	}

}
