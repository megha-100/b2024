package exception;

public class Error_handling {
	//recursive fun
	public static void m()
	{
		m();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we can handle error also with the help of try catch 
		try {
			m();
		}
		catch(StackOverflowError e)
		{
			System.out.println("error is coming");
			//e.printStackTrace();
		}
		System.out.println("bye");
		

	}

}
