package stringManipulation;

public class Stringcompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2=new String("Hello");
System.out.println(s1==s2);
System.out.println(s1.equals(s2));

String s3="Hello";
System.out.println(s1==s3);
String s4="hello";
System.out.println(s1==s4);
String st=new String("Test");//object in heap+ data is stored in scp
String s5="Test";//string constant pool
String t1="megha";
t1.concat("hello");
System.out.println(t1);//megha

String t2="meghahello";
System.out.println(t1.equals(t2));

	}

}
