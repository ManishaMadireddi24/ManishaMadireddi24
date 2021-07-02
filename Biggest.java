import java.util.*;

class Biggest
{
	public static void main(String args[])
	{
		int i,j,n,max;
		int[] arr=new int[16];
		Scanner s=new Scanner(System.in);
		for(i=0;i<16;i++)
		{
			arr[i]=s.nextInt();
		}
		int g=0;
		i=1;
		max=arr[0];
		while(i<16)
		{
			max=Math.max(max,arr[i]);
			
			i++;
			
		}
		System.out.println("Biggest = "+max);
	}
}