import java.util.Scanner;
class Diagonal2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		//System.out.print("Enter size you want");
		//int n=sc.nextInt();
		int a[][]={{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},};
		
	/*	for(int i=0; i<n; i++)
		{
			
			for( int j=0; j<n; j++)
			{
		       System.out.print("Enter element at a["+i+"]["+j+"] ");
		       a[i][j]=sc.nextInt();
			}
			
		System.out.println();
		}
	*/	
	    for(int i=0; i<a.length; i++)
		{
			
			for(int j=0; j<a[i].length; j++)
			{
	
				System.out.print(a[i][j]);
			   
			}
		
		 System.out.println();
		}
		for(int i=0; i<a.length; i++)
		{
			
			for(int j=0; j<a[i].length; j++)
			{
				if(j==i || j==a.length-i-1)
				System.out.print(a[i][j]);
			    else
				System.out.print(" ");
			}
		
		 System.out.println();
		}
		
	}
}