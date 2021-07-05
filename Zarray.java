import java.util.*;

class Zarray
{
	public static void main(String args[])
	{
		int n,i,j;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter array size : ");
		n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		i=0;j=0;
		while(i<n)
		{
			if(a[i]==0)
			{
			}
			else
			{
				//System.out.print(j+" "+i+"     "+a[i]);
				b[j]=a[i];
				j++;
			}
			i++;
		}
		while(j<n)
		{
			b[j]=0;
			j++;
			
		}		
		
		for(i=0;i<n;i++)
			System.out.print(b[i]+" ");
	}
}