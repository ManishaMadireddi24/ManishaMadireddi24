import java.util.*;
class Cmeo
{
public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   int i,evencount=0,oddcount=0;
   System.out.print("Enter array size:");
   int n=sc.nextInt();
   int a[]=new int[n];
   System.out.print("Enter array elements:");
   for(i=0;i<n;i++)
   {
       a[i]=sc.nextInt();
   }
   for(i=0;i<n;i++)
   {
       if(a[i]%2==0)
       evencount++;
       else
       oddcount++;
   }
   int res=evencount*oddcount;
   if(res%2==0)
   System.out.print("EVEN");
   else
   System.out.print("ODD");
}  
}