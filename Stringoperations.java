
		import java.io.*;
import java.util.*;
class Stringoperations
{
 public static void main(String[] args) throws IOException
    {
       Scanner sc=new Scanner(System.in);
       String fin="";
       String x="",y="",z="";
       int count=0;
       String s=sc.nextLine() ;
       char[] arr = s.toCharArray();
       int q=Integer.parseInt(sc.nextLine());
       for(int i=1;i<=q;i++)
       {
       String[] str = sc.nextLine().split(" ");
       int ind=Integer.parseInt(str[0]);
       String s1=str[1];
       char ch = s1.charAt(0);
       arr[ind-1]=ch;
       }
       String s2= String.valueOf(arr);
       System.out.println(s2);
       int m= Integer.parseInt(sc.nextLine());
       for(int j=1;j<=m;j++)
       {
           String[] str1 = sc.nextLine().split(" ");
           int a=Integer.parseInt(str1[0]);
           int b=Integer.parseInt(str1[1]);
           count++;
           if(count==1)
           {
           x=s2.substring(0,a-1);
           y=s2.substring(a-1,b);
           z=s2.substring(b,s2.length());  
           }
           else
           {
            x=fin.substring(0,a-1);
            y=fin.substring(a-1,b);
            z=fin.substring(b,s2.length());
           }
           StringBuffer sb = new StringBuffer(y);
           sb =sb.reverse();
           String mj = sb.toString();
           fin = x+mj+z;  
       }
       System.out.println(fin);
       count=0;
       char[] arr2 = fin.toCharArray();
       for(int k=0;k<arr.length;k++)
       {
           if(arr[k]==arr2[k])
               count++;
       }
       System.out.println(count);
    }
}