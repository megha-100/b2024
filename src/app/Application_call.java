package app;
class Application
{
	public Application login()
	{
		System.out.println("login");
		return this;
		
	}
	public Application login_un_pw(String un,String pw)
	{
		System.out.println("login_un_pw"+un+pw);
		return this;
		
	}
	public Application search_productname(String name)
	{
		System.out.println("search_productname"+name);
		return this;
		
	}
	public Application add_to_cart()
	{
		System.out.println("add_to_cart");
		return this;
		
	}
	public Application check_order_id(String id)
	{
		System.out.println("check_order_id"+id);
		return this;
		
	}
	public Application dopayment()
	{
		System.out.println("dopayment");
		return this;
		
	}
	public Application logout()
	{
		System.out.println("logout");
		return this;
		
	}
}

public class Application_call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Application n=new Application();
//Builder pattern
n.login()
   .search_productname("tv")
    .add_to_cart()
    .check_order_id("979")
     .dopayment()
     .logout();
     
	}

}
