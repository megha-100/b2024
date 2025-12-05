package exception;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//throw your own exception 
		String g=null;
		if(g==null)
		{
			throw new RuntimeException("not found");
		}
System.out.println("bye");
	}

}
