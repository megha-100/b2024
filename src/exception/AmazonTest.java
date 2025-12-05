package exception;
class MyException extends RuntimeException
{
	public MyException(String msg)
	{
		super(msg);
	}
}

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser="yhh";
		switch(browser)
		{
		case "chrome":System.out.println("chrome");
		break;
		case "firefox":System.out.println("firefox");
		break;
		case "edge":System.out.println("edge");
		break;
		case "safari":System.out.println("safari");
		break;
		default:System.out.println("pass the right browser "+browser);
		throw new MyException("wrong browser");
		
		}

	}

}
