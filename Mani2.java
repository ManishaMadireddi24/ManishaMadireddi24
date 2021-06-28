import java.util.*;
import java.io.*;
public class Mani2
{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int first=s.nextInt();
		int last=s.nextInt();
		int i=first;
		
		while(i>=last)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
			i--;
		}
	}
}