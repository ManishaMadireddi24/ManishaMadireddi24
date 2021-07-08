import java.util.*;
class DiagonalMat
{
public static void main(String[] args)
{
 Scanner s=new Scanner(System.in);
 int i,j,r,c;
 
 System.out.print("Enter no. of rows: ");
 r=s.nextInt();
 System.out.print("Enter no. of columns: ");
 c=s.nextInt();
 int a[][]=new int[r][c];
 
 System.out.println("Enter matrix elements:");
 for(i=0;i<r;i++)
 for(j=0;j<c;j++)
 a[i][j]=s.nextInt();
 
 if(r==c)
 System.out.print("The given matrix is diagonal matrix");
 else
 System.out.print("The given matrix is not a diagonal matrix");

}
}