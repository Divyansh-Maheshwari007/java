// Object parameterized constructor
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
	 Student(Student s)
	{
		System.out.println(" Object Parameterized");
		this.rollno = s.rollno;
		this.name = s.name;
	}
	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(rollno+" "+name);
	}
}

class Constructor7{
	public static void main(String args[])
	{
		Student obj1 = new Student(101,"pushpa");
		obj1.display();
		Student obj2 = new Student(obj1);
		obj2.display();
	}
	
}