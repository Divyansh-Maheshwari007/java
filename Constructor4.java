// Constructor private may or may not if constructor is private in same class 
class Student
{
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
	private Student()
	{
		System.out.println(" private constructor");
		rollno = 101;
		name = "pushpa";
	}
}

class Constructor4{
	public static void main(String args[])
	{
		Student obj1 = new Student();
		System.out.println(obj1.getRollno());
		System.out.println(obj1.getName());
	}
	
}