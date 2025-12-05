package javabasics;

public class MathematicalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(9/2);//4(both num and deno are int hence the digits after . is removed)
		 System.out.println(9.0/2);//4.5(numerator is double and result is also double)
		 System.out.println(9/2.0);//4.5
		 
		// System.out.println(9/0);//numerator is int and result is Arithmateic exception
		 System.out.println(9.0/0);//numerator is double and result is infinity
		 
		 System.out.println(9/0.0);//denominator is double and result is infinity
		 
		 System.out.println(9/0.0+1);//Infinity
		 
		 System.out.println((9/0.0)+" naveen");//Infinity naveen

		 System.out.println(9.0/0.0);//both numerator and denominator is double and result is infinity

		// System.out.println(0/0);//numerator is int and result is Arithmateic exception
		 
		 System.out.println(2/9);//0-(both num and deno are int and hence the digits after . is removed)

		 System.out.println(-1/9);//0-(both num and deno are int and hence the digits after . is removed)

		 System.out.println(0.0/9);//0.0(numerator is double)
		 
		 System.out.println(0.0/0);//numerator is double and result is NaN
		  
		 System.out.println(0/0.0);//denominator is double and result is NaN
 
		 System.out.println(0.0/0.0);//both numerator and denominator is double and result is NaN

//modules-rem
		 System.out.println(10%2);//0
		 
		  System.out.println(100%3);//1
		  
		  //System.out.println(9%0);//AE
		  System.out.println(0%9);//0
		  
		  System.out.println(12.3f);//4byte-float
		  
		  System.out.println(10%0.0);//Nan-not a number
		  
		  System.out.println(0.1+0.2);//(8 byte -double)-0.30000000000000004
		  
		  System.out.println(0.2+0.4);//0.6000000000000001

		  
		  


	}

}
