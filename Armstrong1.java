																																						
class Armstrong1{
	public static void main(String[] args){
	int num = 1531;
	int orig_num = num;
	int sum = 0;
	int temp2 = num;
	int count = 0;
	
	while(num != 0)
	{
		count++;//find length
		num = num / 10;
	}
	while(temp2 != 0)
	{
	int digit = temp2 % 10;
	int power = 1;	
	 
	for(int i = 1; i <= count; i++)
	{
		power = power * digit;
	}
	sum += power;
	temp2 /= 10;
	}
	//System.out.println(sum);
	if(sum == orig_num){
	System.out.println("Number is ArmStrong");
	}
	else{
	System.out.println("Number is not ArmStrong");
	}
}	
	
}