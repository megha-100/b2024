package javabasics;

public class NestedLoops {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//6*6
for(int i=0;i<=5;i++)
{
	for(int j=0;j<=5;j++)
	{
		System.out.print(i+""+j+" ");
		//System.out.print(" ");
	}
	System.out.println();
}
//single column
for(int i=0;i<=5;i++)
{
	for(int j=0;j<=5;j++)
	{
		System.out.print(i+""+j+" ");
		//System.out.print(" ");
		break;
	}
	System.out.println();
}
//single row
for(int i=0;i<=5;i++)
{
	for(int j=0;j<=5;j++)
	{
		System.out.print(i+""+j+" ");
		//System.out.print(" ");
		
	}
	System.out.println();
	break;
}
for(int i=0;i<=5;i++)
{
	for(int j=0;j<=5;j++)
	{
		for(int k=0;k<=5;k++)
		{
			System.out.print(i+""+j+""+k+" ");
		}
		System.out.println();
		
	}
	
}

	}

}
