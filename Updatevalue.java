import java.util.*;
class Updatevalue
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value:");
        int n,m;
        ArrayList<Integer>x=new ArrayList<Integer>();
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        x.add(sc.nextInt());
        System.out.print("Enter values:");
        for(Integer i:x)
        System.out.println(i+" ");
        System.out.print("Enter value to search,");
        System.out.print("Update Value:");
        int key=sc.nextInt();
        if(x.contains(key))
        {
           m=sc.nextInt();
           int y=x.indexOf(key);
           x.set(y,m);
        }
        else 
        System.out.print("Element Not Found");
         for(Integer i:x)
        System.out.print(i+" ");
       
    }
       
}