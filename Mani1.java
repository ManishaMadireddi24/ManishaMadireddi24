import java.util.Scanner;
public class Mani1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if(!((c>=65 && c<=90)||(c>=97 && c<=122)))
		{
			System.out.println(c+"is not a character");
		}
		else {
			switch(c)
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				System.out.println(c+"is vowel");
				break;
				default:
				System.out.println(c+"is consonant");
			}
		}
	}
}

	
				