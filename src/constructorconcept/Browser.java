package constructorconcept;

public class Browser {
	public void launchBrowser()
	{
		System.out.println("launchBrowser");
		checkramsize();
		checkbrowser();
		verifystorage();
	}
	private void checkramsize()
	{
		System.out.println("checkramsize");
	}
	private void checkbrowser()
	{
		System.out.println("checkbrowser");
	}
	private void verifystorage()
	{
		System.out.println("verifystorage");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser b=new Browser();
		b.launchBrowser();
	}

}
