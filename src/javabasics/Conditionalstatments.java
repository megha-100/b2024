package javabasics;

public class Conditionalstatments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if-else
		boolean isheadless=true;
		if(isheadless)
		{
			System.out.println("run tc in headless mode");
		}
		else
		{
			System.out.println("run tc in normal mode");
		}
		//if-if-else-if
		int marks=101;
		if(marks<=100)
		{
			if(marks>90)
				System.out.println("GRADE A");
	              if(marks>95)
	            	  System.out.println("100% scholarship");
	                    if(marks==100)
	                    	System.out.println("0% tution fees");
	                    else
	                    	System.out.println("10% tution fees");
		}
		else
		System.out.println("invalid marks");
		
		//if-else if-else if-else
		String browser="chrome";
		if(browser.equals("chrome"))
		{
			System.out.println("chrome is launched");
		}
		else if(browser.equals("edge"))
		{
			System.out.println("edge is launched");
		}
		else if(browser.equals("firfox"))
		{
			System.out.println("ff is launched");
		}
		else if(browser.equals("ie"))
		{
			System.out.println("ie is launched");
		}
		else
			System.out.println("please pass the right browser"+browser);
		
		
	}

}
