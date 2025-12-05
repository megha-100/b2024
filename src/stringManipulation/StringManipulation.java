package stringManipulation;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="hi im megha";
System.out.println(str.length());
System.out.println("lowest= "+0);
System.out.println("highest= "+(str.length()-1));

System.out.println(str.charAt(0));
System.out.println(str.charAt(2));
System.out.println(str.charAt(str.length()-1));
//System.out.println(str.charAt(-1));//SIOE

System.out.println(str.indexOf('i'));//first occurance of i
System.out.println(str.indexOf('h'));
System.out.println(str.indexOf('i', 2));//2nd occurance of i
//index of 2nd occurance of 'i' from location of 1st occurance of i+1
//or 
System.out.println(str.indexOf('i', str.indexOf('i')+1));
//or
System.out.println(str.lastIndexOf('h'));

System.out.println(str.indexOf("megha"));//6-it will calculate char by char
System.out.println(str.indexOf("java"));//-1-not present

String msg="welcome admin";
msg.indexOf("come");//3
//we can calculate index of char or string
if(msg.indexOf("admin")==8)
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}

//trim()
String m=" hello world ";
System.out.println(m.trim());//remove leading trailing spaces

//tolowercase()
//touppercase()

System.out.println(m.toUpperCase());
System.out.println(m.toLowerCase());

//replace()
System.out.println(m.replace(" ", ""));
String n="23-08-94";
System.out.println(n.replace("-", "/"));

//contains()
String j="i love u";
System.out.println(j.contains("love"));//true
System.out.println(j.contains("Love"));//false

//equals
String s1="Megha";
String s2="megha ";
System.out.println(s1.equals(s2));//false
System.out.println(s1.equalsIgnoreCase(s2.trim()));//true

//split(delimiter)
String i="my_name_is_megha";
String[] p = i.split("_");
System.out.println(p[0]);
System.out.println(p.length);
System.out.println(p[p.length-1]);//value at last index

System.out.println(Arrays.toString(p));

String i1="_my_name_is_megha";
String[] p1 = i1.split("_");
//if we split at _ then left hand side will be nothing 
System.out.println(p1[0]);//empty
System.out.println(p1.length);//5

System.out.println(Arrays.toString(p1));
System.out.println("megha:kie:pyi".split(":")[0]);




























	}

}
