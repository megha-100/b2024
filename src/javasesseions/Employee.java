package javasesseions;

public class Employee {
	//global variables
	String name;
	int age;
	boolean isPerm;
	double salary;
	char gender; 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		//e-holds address of Employee object
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.gender);
		System.out.println(e.salary);
		System.out.println(e.isPerm);
		System.out.println("------");
		//setter
		e.name="megha";
		e.age=30;
		e.gender='f';
		e.salary=345.0;
		e.isPerm=true;
		
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.gender);
		System.out.println(e.salary);
		System.out.println(e.isPerm);
		
		System.out.println(e.name+" "+e.age+" "+e.gender);
		//unreferenced objects
		new Employee().name="pooja";//here it will create another employee object by using new keyword 
		//and set name field pooja
		
		//classloader will load the class in classarea
		Employee e1 = new Employee();
		e1=null;
		//System.out.println(e1.name);null pointer exception
		//garbage collector-destroy unreferenced objects 
		//System.gc();-explicitly call gc
		
		
		

	}

}
