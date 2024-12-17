// WAP to pass intivible array to a method and display it.
import java.util.*;
class person{
	Scanner sc = new Scanner(System.in);
	int size,a[],x;
	int enter()
	{
		System.out.println("enter the size of array");
		x = sc.nextInt();
		a[] = new int [x];
		return x;
	}
	int element()
	{
		System.out.println("Enter the element of array");
		for(int i=0; i<x; i++)
		{
			a[i]=sc.nextInt();
		}
	}	
}
class Example4
{
	public static void main(String [] args)
	{
		person obj = new person();
		obj.enter();
		obj.element();
	}
}