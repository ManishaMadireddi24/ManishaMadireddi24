import java.util.*;
import java.io.*;
class Reversestring
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
            for(i=0;i<ch.length;i++)
            {
                c=ch[i];
                String revw="";
                for(j=c.length()-1;j>=0;j--)
                {
                revw=revw+c.charAt(j);
                }
                str=str+revw+" ";
            }
            System.out.print(str);
        }
    }