package javasesseions;

public class User {
	String name;
	int age;
	String city;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1=new User();
		u1.name="poo";
		u1.age=23;
		u1.city="nas";
		User u2=new User();
		u2.name="pooj";
		u2.age=24;
		u2.city="nasi";
		User u3=new User();
		u3.name="pooja";
		u3.age=25;
		u3.city="nasil";
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println();
		u1=u2;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println();
		u2=u3;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println();
		u3=u1;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		//u1=u2=u3

	}

}
