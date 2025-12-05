package stringManipulation;

public class StringIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("hello");
		String s1 = s.intern();//it will return the address of unreferenced entry in scp
		System.out.println(s1);
		System.out.println(s==s1);

	}

}
