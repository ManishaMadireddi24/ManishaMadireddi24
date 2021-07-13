import java.util.*;
import java.io.*;

class Factrecursion
    {
        public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the number:");
        n=sc.nextInt();
        fact(n);
        long s=fact(n);
        System.out.println("Factorial of "+n+" is:"+s);
		}
      public static long fact(int m)
        {
        if(m<=1)
		{
          return 1;
		}
        else
		{
          return m*fact(m-1);
        }
		}
		
    }