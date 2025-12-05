package stringManipulation;

public class StringRev {
	
	public static String rev(String s)
	{
		//null check
		if(s==null)
		{
			throw new RuntimeException("cannot be null");
		}
		//length check
		if(s.length()==1 || s.length()==0)
		{
			return s;
		}
		String rev="";
		int l=s.length();
		while(l>=1)
		{
			rev=rev+s.charAt(l-1);
			l--;
		}
		return(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(rev("megha"));
System.out.println(rev("i"));
//System.out.println(rev(null));
	}

}
