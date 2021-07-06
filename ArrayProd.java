import java.util.*;
class ArrayProd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i;
        int a[],b[],c;
        n=sc.nextInt();
        m=sc.nextInt();
        a=new int[n];
        b=new int[m];
        System.out.print("Enter 1starray elements:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
           
        }
        System.out.print("Enter 2ndarray elements:");
         for(i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
           
        }
        int max=a[0];
        for(i=1;i<n;i++)
        {
            if(a[i]>max)
            max=a[i];
        }
        System.out.println("Maximum element is:"+max);
        int min=b[m-1];
        for(i=0;i<m;i++)
        {
            if(b[i]<min)
            min=b[i];
        }
        System.out.println("Minimum element is:"+min);
        c=max*min;
        System.out.println("product is:"+c);
    }
}