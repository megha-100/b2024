package javabasics;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//string is a final and implements comparable interface and default class and it come from java.util pakage
		String name = "megha";
		String num = "100";
		
		String x = "hello";
		String y = "selenium";
		
		int a = 200;
		int b = 300;
		
		double c = 20.12;
		double d = 20.17;
		
		System.out.println(name+num);
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+a);
		System.out.println(y+b);
		System.out.println(x+y+a);
		System.out.println(a+b+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+b);
		System.out.println(a+b+x+y+(a+b+c+d));
		System.out.println(a+b+c+d+x+y);
		
		//for concatenation the value of the one of operand must be string
		 System.out.println("the value of a is "+a);
		 System.out.println("the value of b is "+b);
		 System.out.println("the value of a+b is "+(a+b));
		 
		char c1='a';
		System.out.println(x+c1);//helloa
		
		char c2='b';
		System.out.println(c1+c2);//97+98-ASCII VALUE
		
		System.out.println(x+(c1+c2));
		System.out.println((byte)c1);
		System.out.println((byte)'*');
		 System.out.println("megha "+'k');
		 System.out.println('a'+'o'+'0'+'&'+"mina"+'p'+'l');
		 
		 //boolean
		 System.out.println(true+"pop");//truepop
		 System.out.println(true+" "+'p');//true p
		  
			}

}
