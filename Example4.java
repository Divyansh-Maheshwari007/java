// WAP to pass entire array to a method and display it
import java.util.*;
class person{
	
	
	void display(int a[])
	{
		for (int i=0; i<a.length; i++)
		System.out.println(a[i]);
	}
}
class Example4{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int  x = sc.nextInt();
		int  a[] = new int[x];
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("enter the element");
			a[i] = sc.nextInt();
		}
		person obj = new person();
			obj.display(a);
		
		
	}
}