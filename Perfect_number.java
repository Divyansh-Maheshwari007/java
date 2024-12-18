// Write a program to check number is perfect or not 
// perfect number is number that number divison perfectly by its small number 
// accept it number and add all divison number is a perfect 
// like number is 6 
// 6 is divison by 1,2,3 and all are sum = 6 is a perfect number; 
import java.util.*;
class Perfect_number{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<num; i++)
		{
			if(num%i==0)
			{
				sum = sum+i;
				
			}
		}
		if(num == sum)
			System.out.print("Number is perfect "+num);
		else
			System.out.println("Number is not perfect "+num);
	}
}