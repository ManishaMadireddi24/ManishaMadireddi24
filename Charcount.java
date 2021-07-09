import java.io.*;
import java.util.*;
class Charcount
{
public static void main(String args[])
{
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the string:");
	String str=sc.nextLine();
	int len=str.length();
	
	for(int i=0;i<len;i++)
	{
		if(str.charAt(i)==' ')
		{
			continue;
		}
		sum++;
	}
	System.out.println(sum);
}
}
