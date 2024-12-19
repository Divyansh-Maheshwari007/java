// Example of Encapsucation

class person
{
	private int id;
	private String name;
	private double salary;
	private boolean Status;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setStatus(boolean Status)
	{
		this.Status=Status;
	}
	public boolean getStatus()
	{
		return Status;
	}
}

class Encapsucation
{
	public static void main(String args[])
	{
		person p1 = new person();
		p1.setId(101);
		System.out.println(p1.getId());
		p1.setName("Divyansh");
		System.out.println(p1.getName());
		p1.setSalary(4000.34);
		System.out.println(p1.getSalary());
		p1.getStatus();
		System.out.println(p1.getStatus());
	}	
}