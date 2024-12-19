// User defined Constructor
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
	Student()
	{
		System.out.println("user defined default constructor");
		rollno = 101;
		name = "pushpa";
	}
}

class Constructor3{
	public static void main(String args[])
	{
		Student obj1 = new Student();
		System.out.println(obj1.getRollno());
		System.out.println(obj1.getName());
	}
	
}