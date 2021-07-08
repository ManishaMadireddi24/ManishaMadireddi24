import java.util.*;
class Rotatelxry
{
public static void main(String[] args)
{
 Scanner s=new Scanner(System.in);
 int i,j,x=0,y=0;
 
 System.out.print("Enter array size:");
 int n=s.nextInt();
 int a[]=new int[n];
 int b[]=new int[n];
 int c[]=new int[n];
 
 System.out.print("Enter array element:");
 for(i=0;i<n;i++)
 a[i]=s.nextInt();
 System.out.print("Enter x value for right rotation: ");
 x=s.nextInt();
 System.out.print("Enter y value for left rotation: ");
 y=s.nextInt();
 for(i=0;i<n;i++)
 {
     if(i-x<0)
     b[i]=a[n+i-x];
     else
     b[i]=a[i-x];
 }
 for(i=0;i<n;i++)
 {
     if(i-y<0)
     c[n+i-y]=b[i];
     else
     c[i-y]=b[i];
 }
 System.out.print("Resultant Array is: ");
 for(i=0;i<n;i++)
 System.out.print(+c[i]+" ");

}
}