// prime number 
class Prime_number
{
	public static void main(String args[])
	{
		int n = 5;
		int x = 0;
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
			System.out.println("prime");
		}	
		else 
		{
			System.out.println("not prime");
		}
		
	}
}