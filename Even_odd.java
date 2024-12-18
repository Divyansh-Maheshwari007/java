// WAP to pass entire array to method and dispaly count of even and odd number.
import java.util.*;
class Even_odd
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array ");
    int x = sc.nextInt();
    int a[] = new int[x];
	
    for (int i=0; i<a.length; i++)
	{
		System.out.println("Enter the Elements ");
		a[i] = sc.nextInt();
	}
	int count = 0;
	int count1 = 0;
	for(int i=0; i<a.length; i++)
	{
		if(a[i]%2==0)
		{
			System.out.println("Even number "+a[i]);
			count++;
		}
		else 
		{
			System.out.println("Odd number "+a[i]);
			count1++;
		}
		}
		System.out.println();
		System.out.println("numbers of even number is  "+count);
		System.out.println("numbers of odd number is  "+count1);

	}
}