// WAP to read array from user and count How many perfect number in that array
import java.util.*;
class Perfect_number2
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array");
		int x = sc.nextInt();
		int a[] = new int[x];
		
		
		for(int i=0; i<a.length; i++)
		{
		System.out.print("Enter a number : ");
		a[i] = sc.nextInt(); 
		}
		
		for(int i=0; i<a.length; i++)
		{
			int sum=0;
			for(int j=1; j<a[i]; j++)
			{
				if(a[i]%j==0)
					sum += j;
			}
			if(a[i]==sum)
				System.out.println("Number is a perfect "+a[i]);
			else 
				System.out.println("Number is not a perfect "+a[i]);

		}
	}
}