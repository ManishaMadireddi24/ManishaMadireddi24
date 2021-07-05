import java.util.*;

class Duparray
{
	public static void main(String args[])
	{
		int n,i,k,j;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter array size : ");
		n=s.nextInt();
		int a[]=new int[100];
		int b[]=new int[100];
		//int b[]=new int[n];
		
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		
		int c=0;i=0;k=0;
		lab:
		for(i=0;i<n;i++)
		{
			int t=a[i];
						
				for(j=i+1;j<n;j++)
				{
					if(a[j]==t)
					{
						b[k]=a[i];
						k++;
						break;
					}
				}
			
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(b[j]==b[i])
					b[j]=0;
			}
		}
		System.out.print("Duplicate elements are : ");
		for(i=0;i<n;i++)
			if(b[i]!=0)
			System.out.print(b[i]+" ");
			
	}
}