// progra without constructor
class Person
{
	int rollno;
	String name;
	
	void setRollno(int rollno)
	{
		this.rollno = rollno;
	}
	public int getRollno()
	{
		return rollno;
	}
	void setName(String name)
	{
		this.name = name;
	}
	void display()
	{
		System.out.println(rollno+" :"+name);
	}
}
 
class Constructor{
	public static void main(String args[])
	{
		Person obj = new Person();
		obj.setRollno(101);
		obj.setName("Divyansh");
		obj.display();
	}
}