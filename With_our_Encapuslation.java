// Example withoutt Encapsulation
class person
{
	int id;
	String name;
}
class person2
{
	int id1;
	String name2;
}

class With_our_Encapuslation{
	public static void main(String [] args)
	{
		person p1 = new person();
		p1.id = 104;
		System.out.println(p1.id);
		p1.name = "abc";
		System.out.println(p1.name);
		
		person2 p2 = new person2();
		p2.id1 = 1040;
		System.out.println(p2.id1);
		p2.name2 = "abcdf";
		System.out.println(p2.name2);
	
	}
}

 