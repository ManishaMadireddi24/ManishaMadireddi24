import java.util.*;
import java.io.*;
public class Mani
{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int even=0,odd=0,r;
	while(num>0)
	{
		r=num%10;
		if(r%2==0)
			even++;
		else
			odd++;
		num=num/10;
	}
	System.out.println("Odd digits:"+odd+"\neven digits:"+even);
}
}

 