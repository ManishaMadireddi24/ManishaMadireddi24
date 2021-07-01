import java.util.*;
class Pattern1
{
	public static void main(String args[])
	{
		int i,j,n,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		//k=sc.nextInt();
		for(i=1;i<=n-1;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=n;i>=0;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//for(j=1;j<=1;j++)
		
			//System.out.println();
		
	}
}
			
			