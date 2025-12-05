package javabasics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[]a= {1,2,3,4};
		//group of similar data type
		//static array is fixed
int[]a=new int[4];
//if we not aware of data
a[0]=10;
a[1]=20;
a[2]=30;
a[3]=40;
System.out.println(a);//print the address
//for all non primitive data type it will internally call toString() method of particular class,
//if the method is not available in that particular class it will take the toString() method of object class 
//it will return the address in string format
//System.out.println(a[-1]);//ArrayIndexOutOfBoundsException
//length of array .length
int len=a.length;
for(int i=0;i<=len-1;i++)
{
	System.out.println(a[i]);
}
//to return the value
System.out.println(Arrays.toString(a));
//for each loop
for(int e:a)
{
	System.out.println(e);
}
double[]b=new double[3];
b[0]=10.34;
b[1]=20.00;
b[2]=30.45;
for(double m:b)
{
	System.out.println(m);
}

char[]f=new char[3];
f[0]='e';
f[1]='[';
f[2]='f';
for(char n:f)
{
	System.out.println(n);
	if(n=='[')
		break;
}
System.out.println(Arrays.toString(f));

String[]s=new String[3];
s[0]="megha";
s[1]="asj";
s[2]="dfk";
System.out.println(Arrays.toString(s));

Object[] o=new Object[5];
o[0]="megha";
o[1]=23;
o[2]='f';
o[3]=78.99;
o[4]=true;
System.out.println(Arrays.toString(o));

//array in reverse order
for(int i=o.length-1;i>=0;i--)
{
	System.out.println(o[i]);
}

//Array literals
int[]num= {10,20,40,89,90};
//if we aware of data
System.out.println(num.length);
System.out.println(Arrays.toString(num));
for(int n:num)
{
	System.out.println(n);
}

	}

}
