package javabasics;

public class Loops {
	public static void main(String[] args) {
		//while loop
		//2,4,6,8,10
		int i=2;
		while(i<=10)
		{
			System.out.println(i);
			i+=2;//i=i+2//i++
		}
		System.out.println();
		int p=1;
		while(p<=10)
		{
			System.out.println(p);
			if(p==5)
			{
				System.out.println("bye");
				break;
			}
			p++;//i=i+2//i++
		}
		//10 to 1
		int t=10;
		while(t>=1)
		{
			System.out.println(t);
			t--;
		}
		//for loop
		for(int j=1;j<10;j++)
		{
			System.out.println(j);
		}
		int k=1;
		for(;;)
		{
			
			System.out.println(k);
			k++;
			if(k>=10)
				break;
			
			
		}
		for(byte j=1;j<10;j++)
		{
			System.out.println(j);
		}
		for(short j=1;j<10;j++)
		{
			System.out.println(j);
		}
		for(long j=1L;j<10L;j++)
		{
			System.out.println(j);
		}
		for(float j=1.0f;j<10.0f;j++)
		{
			System.out.println(j);
		}
		for(double j=1.0;j<10.0;j++)
		{
			System.out.println(j);
		}
		for(char j='a';j<='z';j++)
		{
			System.out.println(j);
		}
		//ASCII TABLE
		for(char j='a';j<='z';j++)
		{
			int c=j;
			//System.out.println(j);
			System.out.println((byte)j);
		}
		//when the no of iterations is not fixed-while loop
		int q=1;
		for(System.out.println(q);;System.out.println("bye"))
		{
			System.out.println("hello");
			
			if(q>3)
				break;
			q++;
		}
//		byte c=34;//127 then it will start giving -values
//		while(true)
//		{
//			System.out.println(c);
//			c++;
//		}
			
	}
}
