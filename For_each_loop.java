import java.util.*;
class For_each_loop
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int y = sc.nextInt();
		int x[] = new int [y];
		System.out.println("Enter the elements of array ");
		for (int i=0; i<x.length; i++)
		{
			x[i] = sc.nextInt();
		}
		System.out.println("Enter elements are ");
		for(int p : x )
			System.out.println(p);
	}
}