import java.util.*;
class Evenoddwise
    {
        public static void main(String args[])
        {
            String s;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter String:");
            s=sc.next();
            int n=s.length();
            char ch[]=s.toCharArray();
            int i;
            for(i=0;i<n;i++)
            {
                if(ch[i]%2!=0)
                 System.out.print(ch[i]);
            }
            System.out.print(" ");
            for(i=0;i<n;i++)
            {
                if(ch[i]%2==0)
                 System.out.print(ch[i]);
            }
           
        }
    }