import java.util.*;
public class EvenOdd {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter input : ");
		int nr = in.nextInt();
        int ev=0,od=0,rem,i=0,j=0,even=0,odd=0;
       while(nr != 0)   
       {  
        rem = nr % 10;  
        if(rem%2==0)
        ev= ev*10+rem;
        else
        od=od*10+rem;
        nr/=10;
}
while(ev!=0)
{
	rem=ev%10;
	even=even*10+rem;
	ev=ev/10;
}
while(od!=0)
{
	rem=od%10;
	odd=odd*10+rem;
	od=od/10;
}
System.out.println("Output :\neven : "+even+"\n Odd : "+odd); 
}
}