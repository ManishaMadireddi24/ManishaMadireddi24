import java.util.*;
import java.io.*;
class Insertposition
    {
        public static void main(String args[])
        {
            String n,c;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter string:");
            n=sc.nextLine();
            System.out.print("Enter inserting string:");
            String ins=sc.next();
            System.out.print("Enter position to insert:");
            int p=sc.nextInt();
            String ch[]=n.split(" ");
            int i,j;
            String str="";
            for(i=0;i<ch.length;i++)
            {
                c=ch[i];
                String w="";
                for(j=0;j<c.length();j++)
                {
                if(j==(p-1))
                w=w+ins+c.charAt(j);
                else
                w=w+c.charAt(j);
                }
                str=str+w+" ";
            }
            System.out.print(str);
        }
    }