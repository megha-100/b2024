package javasesseions;

public class MainMethodOverloading {
	public static void main()
	{
		System.out.println("main");
		main(10);
	}
	public static void main(int a)
	{
		System.out.println("intmain "+a);
		main(a+"");
	}
	public static void main(String b)
	{
		System.out.println("Stringmain "+b);
	}
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
System.out.println("hello");
main();
	}

}
