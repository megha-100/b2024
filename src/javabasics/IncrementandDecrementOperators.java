package javabasics;

public class IncrementandDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//++,--
		//postincrement
		int a=1;
		//assign and then inc
		int b=a++;//b=1,a=2
		System.out.println(a);
		System.out.println(b);
		
		int c=-34;
		int d=c++;//d=-34,c=-33
		System.out.println(c);
		System.out.println(d);
		
		//preincrement
		//inc and then assign
		int p=1;
		int o=++p;//p=2,0=2
		System.out.println(p);
		System.out.println(o);
		
		int u=-34;
		int r=++u;//u=r=-33
		System.out.println(u);
		System.out.println(r);
		
		////postdecrement
		int e=-39;
		int f=e--;//f=-39,e=-40
		System.out.println(e);
		
		System.out.println(f);
		
		int total=100;
		System.out.println(total++);//100 and then inc
		System.out.println(total);//101
		
		int total1=100;
		System.out.println(total1--);//100
		System.out.println(total1);//99
		//predecrement
		int z=-39;
		int x=--z;//x=-40,z=-40
		System.out.println(z);
		
		System.out.println(x);
		
		int i=11;
		int j=i++ + ++i;//11+13=24
		System.out.println(i);	
		System.out.println(j);
		
		int t=11,v=12,q;
		q=t+v+t++ + v++ + ++t + ++v;
		System.out.println("t= "+t);
		System.out.println("v= "+v);
		System.out.println("q= "+q);
		
		//solve
//	1.	int i=0;
		//int j=i++ - --i + ++i - i--
		
		//2. int m=n=0;
		//p=--m * --n *n-- *m--
		
		//3. int a=1;
		//b=a++ + ++a * --a - a--
		
		//int a=23++//invalid
		
		char ch='A';
		System.out.println(ch++);//'A'-65
		System.out.println(ch);//'B'-66
		System.out.println((byte)ch);//66
		
		double r1=2.2;
		System.out.println(r1++);//2.2
		System.out.println(r1);//2.2+1.0=3.2
		
		
	}

}
