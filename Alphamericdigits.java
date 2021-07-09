import java.util.*;
class Alphamericdigits
{
public static void main(String[] args)
{
String str;

Scanner sc=new Scanner(System.in);
System.out.print("Enter String:");
str=sc.next();
int u=0,l=0,d=0,s=0;
char ch[]=str.toCharArray();
for(int i=0;i<ch.length;i++)
{
   if(Character.isUpperCase(ch[i]))
   u++;
   else if(Character.isLowerCase(ch[i]))
   l++;
   else if(Character.isDigit(ch[i]))
   d++;
   else
   s++;
}

if(u==l)
{
   if(d==s)
   System.out.print("YES");
   else
   System.out.print("NO");
}
else
System.out.print("NO");
}
}