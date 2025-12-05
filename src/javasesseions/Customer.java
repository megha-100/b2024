package javasesseions;

public class Customer {
	public int getCustomerMarks(String name)
	{
		System.out.println("customer name is "+name);
		int m;
		switch(name)
		{
		case "piyush":m=90;
		 break;
		case "veena":m=30;
		break;
		case "pooja":m= 0;
		break;
		default:System.out.println("please pass the right name");
		m=-1;
		}
		return m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		int m = c.getCustomerMarks("piyush");
		System.out.println(m);
		if(m>=0)
		{
			System.out.println("print the marks sheet");
		}
	}

}
