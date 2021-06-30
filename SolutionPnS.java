import java.util.*;


class SolutionPnS {
	
    public static void main(String args[])
	{
		int num,r=0;
		System.out.print("Enter a number : ");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		
        int rem = 0, sum = 0, prod=1;
        while(num > 0){  
            rem = num%10;  
            sum = sum + rem;
            prod =prod*rem;
            num = num/10;  
        }
            r = (prod-sum);
		System.out.println("Result = "+r);
	}
}