import java.util.*;  
import java.lang.*;
 
class Twinprimes  
 {
   public static void main(String[] args) 
   {
       Scanner s = new Scanner(System.in);
       int m = s.nextInt();  
       int n =s.nextInt();
       int c=0,i,j;
       for(i=m;i<n;i++)
       {
       for(j=i+1;j<=n;j++)
       {
       if ((isPrime(i) && isPrime(j) )&& Math.abs(i-j)==2)
        {  
            if(isPrime(i,(i+2)))
            System.out.print(("%d,%d\n")+i +(i+2));

       }
       }
       }
       
 
   public static boolean isPrime(int z) {
       if (z <= 1) {  
           return false;  
       }  
       for (int x = 2; x <= Math.sqrt(z); x++) {  
           if (z % x == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
}