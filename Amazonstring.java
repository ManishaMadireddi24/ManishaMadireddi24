import java.util.*;
import java.io.*;
class Amazonstring
{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String:");
    String st=sc.nextLine();
    int m=0;
    int n=st.length()-1;
    while(m<n && st.charAt(m)==st.charAt(n))
    {
       int a=st.charAt(m);
       while(m<n && st.charAt(m)==a)
       m++;
       while(m<n && st.charAt(n)==a)
       n--;
    }
    System.out.print((n-m)+1);
}
}