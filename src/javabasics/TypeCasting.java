package javabasics;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//byte short int long
		//converting one data type to another - TypeCasting
		//auto widening-converting lower data type to higher
		//explicit narrowing-converting higher data type to lower explicitly(explicit mention data type in ())
	byte b=12;
	short s=b;//auto widening
	System.out.println(s);
	short s1=200;
	byte b1=(byte)s1;
	//-128 to 127
	System.out.println(b1);//-56(-256+200)
	short s2=1000;
	byte b2=(byte)s2;
	System.out.println(b2);//-24(-1000+256=-744+256=-488+256=-232+256=-24(- indicates losing)
	short s3=20;
	byte b3=(byte)s3;
	System.out.println(b3);//20
	
	int p=100;
	float o=p;
	System.out.println(o);//100.0
	
	float q=23.45f;
	int r=(int)q;
	System.out.println(r);//23
	
	//auto widening
	int p1=100;
	double o1=p1;
	System.out.println(o1);//100.0
	
	
	char c='a';
	int z=c;
	System.out.println(z);//97
	//explicit narrowing
	int i=20000;
	char e=(char)i;
	System.out.println(e);
	
	
		
	}
	

}
