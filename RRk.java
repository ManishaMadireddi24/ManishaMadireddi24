import java.util.*;
class RRk
{
public static void main(String args[])
{
	int i,j,n,m=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array size:");
	n = sc.nextInt();
	int a[]=new int[n];
	System.out.print("Enter array elements:");
	for(i=0;i<n;i++)
		a[i]=sc.nextInt();
	System.out.print("Enter num of rotations:");
	m = sc.nextInt();
	for(j=n-m;j<n;j++)
	
		System.out.print(a[j]+" ");
		for(i=0;i<n-m;i++)
		
			System.out.print(a[i]+" ");
		
	
}
		
}

