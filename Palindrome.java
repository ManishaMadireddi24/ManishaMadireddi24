import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		String s,s1="";
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the string:");
		s  = sc.next();
        int n=s.length();
         for(int i=n-1;i>=0;i--)
		 {
			 s1=s1+s.charAt(i);
		 }
		 if(s.equalsIgnoreCase(s1))
		 {
			 System.out.println("palindrome");
		 }
		 else
			 System.out.println("not palindrome");
	}
}
	
			 
		