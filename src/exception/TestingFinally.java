package exception;

public class TestingFinally {
	public static int studentname(String name)
	{
		System.out.println("getting marks for:"+name);
		if(name.equals("veena"))
		{
			try {
				int i= 9/5;
				System.exit(9);//shutdown the jvm
				return 10;
			}
			catch(ArithmeticException e)
			{
				System.out.println("AE");
				return 30;
			}
			finally
			{
				System.out.println("bye");
				return 90;//it will override the return present in catch block and also execute bye
			}
		}
		else if(name.equals("vibha"))
		{
			try {
				int i= 9/6;
				return 10;
			}
			catch(ArithmeticException e)
			{
				System.out.println("AE");
				return 30;
			}
			finally
			{
				System.out.println("bye");
				return 50;//it will override the return present in try block and also execute bye
			}
		}
		else if(name.equals("via"))
		{
			return 100;
			
		}
		else
		{
			try {
				int p=8/0;
			}
			finally {
				return 5;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m=studentname("ve");
		System.out.println(m);
	}

}
