package javabasics;

public class Timecomplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//tc-Big O(n)
		//code optimization
		int i=1;
		//syso is running only one 1 time irrespective of i
		System.out.println(i);
		//hence Tc-O(1)
		//constant time
		
		for(int j=0;j<=5;j++)
		{
			System.out.print(j+" ");//syso
			//System.out.print(" ");
		}
		//int j=0;->will take only 1 time
		//j<=5;->this code will take 5time ,generally n time
		//syso(j);->this code will take 5time ,generally n time
		//j++;->this code will take 5time ,generally n time
		
		//tc=1+n+n+n=3n+1;
		//in general,tc=O(n)
		for(int k=0;k<=5;k++)
		{
			for(int j=0;j<=5;j++)
			{
				System.out.print(k+""+j+" ");
				//System.out.print(" ");
			}
			System.out.println();
		}
		//tc=(1+3n)(1+3n)=1+3n+3n+9n^2=1+6n+9n^2=6n+9n^2=3n(2+3n)=9n^2=n^2
		//tc=n^2;
		//binary search
		//tc=t=n/k
		//log t=log n-log k
		//log t=1-log k
		//log t= log k
	}

}
