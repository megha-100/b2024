package javasesseions;

public class Browser {
	
	public static boolean launchbrowser(String browser)
	{
		System.out.println("browser name is "+browser);
		boolean flag=true;
		switch(browser.toLowerCase().trim())
		{
		case "chrome":System.out.println("chrome");;
		 break;
		case "edge":System.out.println("edge");;
		break;
		case "firefox":System.out.println("firefox");;
		break;
		default:System.out.println("please pass the right browser");
		flag=false;
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean launch = launchbrowser("chrome");
		if(launch)
		{
			System.out.println("enter the url");
		}
	}

}
