package javasesseions;

public class Student {
	
	public static int getStudentmarks(String name)
	{
		System.out.println("Studentname is "+name);
		switch(name.trim().toLowerCase())
		{
		case "priya":return 90;
		case "ravi":return 100;
		case "megha":return 80;
		case "saji":return 70;
		default:System.out.println("please pass the right name");
		return -1;
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = getStudentmarks(" pravi");
		System.out.println(marks);
		if(marks>=0)
		{
			System.out.println("print the marks sheet");
		}
	}

}
