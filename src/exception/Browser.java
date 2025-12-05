package exception;
//throws-throw the exception to the caller
public class Browser {
	//amazon app
	public void search() 
	{
		System.out.println("m1");
		cart();
	}
	//amazon app
	public void cart() 
	{
		System.out.println("m2");
		try {
			bankpayment();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("try after sometime");
		}
		
	}
	//bank
	public void bankpayment() throws ArithmeticException
	{
		System.out.println("m3");
		int a=1/0;
	}
//caller method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser b=new Browser();
		b.search();
		System.out.println("bye");

	}

}
