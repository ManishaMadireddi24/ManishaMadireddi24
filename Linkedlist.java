import java.util.*;
class Linkedlist
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value:");
        int n,m;
        LinkedList<Integer>x=new LinkedList<Integer>();
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        x.add(sc.nextInt());
        System.out.print("Enter values:");
        for(Integer i:x)
        System.out.print(i+" ");
        System.out.print("\n");
        System.out.print("Enter value to search:");
        int key=sc.nextInt();
        if(x.contains(key))
        {
           int y=x.indexOf(key);
           x.remove(y);
        }
        else
        System.out.print("Element Not Found");
         for(Integer i:x)
        System.out.print(i+" ");
       
    }
       
}
