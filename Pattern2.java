import java.util.*;
class Pattern2
{
	public static void main(String args[])
	{
		char c;
		int n,i,j;
		System.out.println("Enter a number : ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		c=64;
		loop1:
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				c++;
				System.out.print(c+" ");
				 
				 if(c==90)
					 break loop1;
				 
			}
			System.out.println();
		}
		
		
		
		
	}	
}