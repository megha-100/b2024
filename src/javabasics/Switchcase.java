package javabasics;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser="chrome";
		switch(browser)
		{
		case "chrome":System.out.println("chrome is launched");
		               break;
		case "edge":System.out.println("edge is launched");
        break;
		case "ff":System.out.println("ff is launched");
        break;
		case "ie":System.out.println("ie is launched");
        break;
        default:System.out.println("please pass the right browser"+browser);
        break;
		               
		}
	}

}
