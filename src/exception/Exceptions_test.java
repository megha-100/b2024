package exception;

public class Exceptions_test {
 String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		try {
			System.out.println(10/1);//AE
			
			Exceptions_test e = new Exceptions_test();
			e.name.length();//NPE
			
		}
//		
		catch(ArithmeticException e)
		{
			System.out.println("handled");
			e.printStackTrace();
			
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException handled");
			e.printStackTrace();
			
		}
		//if we dont no which exception is coming
		catch(Exception e)
		{
			System.out.println("handled");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		//if we dont no which (exception or error) is coming 
		catch(Throwable e)
		{
			System.out.println("handled");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		System.out.println("bye");

	}

}
