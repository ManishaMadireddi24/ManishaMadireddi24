import java.util.*;
class Frameworksortedorder
{
public static void main(String args[])
{
	ArrayList<Integer>j=new ArrayList<Integer>();
	ArrayList<Integer>m=new ArrayList<Integer>();
	j.add(10);
	j.add(20);
	j.add(30);
	j.add(40);
	m.add(100);
	m.add(200);
	m.add(300);
	m.add(400);
	System.out.println("Enter first Array:"+j);
	System.out.println("Enter first Array:"+m);
	m.addAll(j);
	Collections.sort(m);
	System.out.println("Final List:"+m);
}
}