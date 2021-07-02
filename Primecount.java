import java.util.*;
class Primecount
{
public static void main(String args[])
{
	int i,j,n,f=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	n= sc.nextInt();
	//m= sc.nextInt();
	for(j=2;j<=n;j++)
	{	
		f=0;
		for(i=2;i<j;i++)
		{
			if(j%i==0)
			{
				f=1;
				break;
			}
		}
		
			if(f==0)
			{
				System.out.print(i+" ");
			}
			
		
	}

}
}
