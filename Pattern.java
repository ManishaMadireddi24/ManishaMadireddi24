import java.util.*;
class Pattern
{
	public static void main(String args[])
	{
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();

		//i=n;
		for(i=n;i>=0;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
							
			}
			System.out.println();
		}
	}
}
