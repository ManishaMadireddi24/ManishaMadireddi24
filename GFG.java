import java.util.*;
class GFG 
{
    static int replaceDigit(int x, int d1, int d2)
    {
        int result = 0, multiply = 1;
        while (x / 10 > 0) 
        {
            int remainder = x % 10;
            if (remainder == d1)
                result = result + d2 * multiply;
            else
                result = result + remainder * multiply;
            multiply *= 10;
            x = x / 10;
        }
        if (x == d1)
            result = result + d2 * multiply;
        else
            result = result + x * multiply;
        return result;

    }
    public static void main(String[] args)

    {
       Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
        int n = sc.nextInt();
		System.out.print("Enter x : ");
        int x= sc.nextInt();
		System.out.print("Enter y : ");
        int y= sc.nextInt();
        System.out.println(replaceDigit(n,x,y));
    }
}