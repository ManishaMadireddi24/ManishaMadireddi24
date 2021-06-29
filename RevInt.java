import java.util.*;
public class RevInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.println("Enter input : "); 
        int nr = in.nextInt();
        int rem,rev=0;
if(nr<1000000000)
{
while(nr != 0)   
{  
rem = nr % 10;  
rev= rev * 10 + rem;  
nr /=10;  
}
}
System.out.println("Output : "+rev); 
}
}


    
