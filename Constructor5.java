// Constructor private may or may not if constructor is private in same class 


class Constructor5{
	private int rollno;
	private String name;
	
	public int getRollno()
	{
		return rollno;
	}
	public String getName()
	{
		return name;
	}
	 private Constructor5()
	{
		System.out.println("Private constructor");
		rollno = 101;
		name = "pushpa";
	}
	public static void main(String args[])
	{
		Constructor5 obj1 = new Constructor5();
		System.out.println(obj1.getRollno());
		System.out.println(obj1.getName());
	}
	
}