// WAP to pass entire array to a method and count how many prime numbers are their.
class Prime_number2
{
	public static void main(String args[])
	{
		int count = 0;
		int a[] = {10,11,23,44,55};
		int n;
		for(int j=0; j<a.length; j++)
		{
		n=a[j];
		int x=0;
		for (int i=2; i<=n/2; i++)
		{
			if (n%i==0)
			{
				x=1;
				break;
			}	
		}
		if(x==0 && n>1)
		{
			count++;
			System.out.println("prime "+n);
		}	
		else 
		{
			System.out.println("not prime "+n);
		}
		}
		System.out.println("there are "+count +" prime number");
	}
}-