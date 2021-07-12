import java.util.*;
import java.lang.*;
class Startupper
{
	public static void main(String args[])
	{
		String str,m;
		int i,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		str = sc.nextLine();
		int n=str.length();
		StringBuffer s = new StringBuffer();
		
		char ch[]=str.toCharArray();
		
		for(i=0;i<n;i++)
		{ 
            if (i == 0 && ch[i] != ' ' ||
                ch[i] != ' ' && ch[i - 1] == ' ') {
 
               
                if (ch[i] >= 'a' && ch[i] <= 'z') {
 
                    
                    ch[i] = (char)(ch[i] - 'a' + 'A');
                }
            }		
		}
		m=String.valueOf(ch);
		System.out.print(" "+m);
	}
}