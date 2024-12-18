// seter geter 
class person
{
	private int eid;
	private String name;
	private char grade;
	private double salary;
    private	boolean status;
	
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	public int getEid()
	{
		return eid;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setGrade(char grade)
	{
		this.grade=grade;
	}
	public char getGrade()
	{
		return grade;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setStatus(boolean status)
	{
		this.status = status;
	}
	public boolean getStatus()
	{
		return status;
	}
}


class Employe{
	public static void main(String args[])
	{
		person p1 = new person();
		p1.setEid(101);
		System.out.println(p1.getEid());
		p1.setName("Divyansh");
		System.out.println(p1.getName());
		p1.setGrade('A');
		System.out.println(p1.getGrade());
		p1.setSalary(100.2);
		System.out.println(p1.getSalary());
		p1.setStatus(true);
		System.out.println(p1.getStatus());
	}
}