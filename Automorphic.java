import java.io.*;
import java.util.*;
class Automorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
		System.out.print("Enter a number : ");
        n=sc.nextInt();
        int count=0,square=n*n;
        int temp=n;
        while(temp>0)
        {
            count++;
            temp=temp/10;
        }
        int l=(int)(square%(Math.pow(10,count)));
        if(n==l)
        System.out.println("Automorphic");
        else
        System.out.println("Not Automorphic");
       
       
       
    }
}