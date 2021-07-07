import java.util.*;
class Countprimes
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int i,j,count=0,m=0;

  System.out.print("Enter array size:");
  int n=sc.nextInt();
  int a[]=new int[n];
  System.out.print("Enter array element:");

  for(i=0;i<n;i++)
  {
      a[i]=sc.nextInt();
  }
  for(i=0;i<n;i++)
  {
     count=0;
     for(j=1;j<=a[i];j++)
     {
         if(a[i]%j==0)
         count++;
     }
  if(count==2)
  m++;
  }
  System.out.println(m);
}  
}