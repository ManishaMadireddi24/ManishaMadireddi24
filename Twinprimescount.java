import java.util.*;  
import java.lang.*;
import java.io.*; 
 class Twinprimescount 
 {
  
   public static void main(String[] args) {  
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
        
        c++;
       }
       }
       }
       System.out.println(c);
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