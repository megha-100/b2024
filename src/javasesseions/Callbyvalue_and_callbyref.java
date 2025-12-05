package javasesseions;

public class Callbyvalue_and_callbyref {
	String name;
	int age;
	public void test3(int a)
	{
		System.out.println(a);
	}
	public static void t1(Callbyvalue_and_callbyref p)
	{
	//this applicable only for non static methods and properties	
		p.test3(20);
		System.out.println(p.name+" "+p.age);
		p.name="juo";
		p.age=89;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Callbyvalue_and_callbyref obj = new Callbyvalue_and_callbyref();
		obj.test3(10);
		obj.name="megha";
		obj.age=30;
t1(obj);
System.out.println(obj.name+" "+obj.age);
	}

}
