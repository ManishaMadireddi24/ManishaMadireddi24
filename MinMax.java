import java.util.*;
class MinMax
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter array size:");
        n=sc.nextInt();
        int a[];
        a=new int[n];
        System.out.print("Enter array elements:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(i=1;i<n;i++)
        {
            if(a[i]>max)
            max=a[i];
        }
        System.out.println("Maximum element is:"+max);
        int min=a[n-1];
        for(i=0;i<n;i++)
        {
            if(a[i]<min)
            min=a[i];
        }
        System.out.println("Minimum element is:"+min);
    }
}