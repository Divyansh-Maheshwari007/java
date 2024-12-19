
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
	 Student(int rollno,String name)
	{
		System.out.println(" Parameteriezed cscsconstructor");
		this.rollno = rollno;
		this.name = name;
	}
	void display()
	{
		System.out.println(rollno+" "+name);
	}
}

class Constructor6{
	public static void main(String args[])
	{
		Student obj1 = new Student(101,"pushpa");
		obj1.display();
		Student obj2 = new Student(102,"kuttapa");
		obj2.display();
	}
	
}