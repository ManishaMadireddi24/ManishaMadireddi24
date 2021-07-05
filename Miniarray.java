import java.util.*;
class Miniarray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size,i;
        System.out.print("Enter array size:");
        size=sc.nextInt();
        int a[];
        a=new int[size];
        System.out.println("Enter array elements:");
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print("Minimum element is:"+a[0]);
    }
}
