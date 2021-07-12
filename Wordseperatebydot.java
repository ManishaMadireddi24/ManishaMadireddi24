import java.util.*;
import java.io.*;
class Wordseperatebydot
    {
        public static void main(String args[])
        {
            String n,c;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter string:");
            n=sc.nextLine();
            String ch[]=n.split(" ");
            int i,j;
            String str="";
            String str1="";
            for(i=ch.length-1;i>=0;i--)
            {
               c=ch[i];
                String rev="";
                for(j=0;j<c.length();j++)
                {
                rev=rev+c.charAt(j);
                }
                if(i>0)
                rev=rev+".";
               
                str=str+rev;
            }
            System.out.print(str);
           
        }
    }