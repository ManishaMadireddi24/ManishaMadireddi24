import java.util.*;
import java.io.*;

class Switchconversions
    {
        public static void main(String args[])
        {
            int n,c;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your choice:");
            c=sc.nextInt();
            System.out.print("Enter Decimal number:");
            n=sc.nextInt();
            switch(c)
            {
                case 1:
                    System.out.print(Integer.toBinaryString(n));
                    break;
                case 2:
                    System.out.print(Integer.toOctalString(n));
                    break;
                case 3:
                    System.out.print(Integer.toHexString(n));
                    break;
               
            }
           
           
        }
    }