import java.util.*;

class Mulr
{
	public static void main(String args[])
	{
		int i,j,n,s1=0,s2=0;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter array size : ");
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		int f=0,in=n/2;
		j=0;
		while(j<=in-1)
		{
			s1+=a[j];
			j++;
		}
		while(j<n)
		{
			s2+=a[j];
			j++;
		}
			
		
		System.out.println("Product = "+s1*s2);
	}
}