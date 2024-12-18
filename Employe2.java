class Person{
	private long em_number;
	private String em_name;
	private long em_mo_number;
	private String em_address;
	private double salary;
	
	public void setEm_number(long em_number)
	{
		this.em_number = em_number;
	}
	public long getEm_number()
	{
		return em_number;
	}
	public void setEm_name(String em_name)
	{
		this.em_name = em_name;
	}
	public String getEm_name()
	{
		return em_name;
	}
	public void setEm_mo_number(long em_mo_number)
	{
		this.em_mo_number = em_mo_number;
	}
	public long getEm_mo_number()
	{
		return em_mo_number;
	}
	public void setAddress(String em_address)
	{
		this.em_address = em_address;
	}
	public String getAddress()
	{
		return em_address;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public double getSalary()
	{
		return salary;
	}
	
}


class Employe2{
	public static void main(String [] args)
	{	
		Person p1 = new Person();
		p1.setEm_number(111111);
		p1.setEm_name("Divyansh");
		p1.setEm_mo_number(9399510482l);
		p1.setAddress("Indore");
		p1.setSalary(40000);
		
		Person p2 = new Person();
		p2.setEm_number(222222);
		p2.setEm_name("Amit");
		p2.setEm_mo_number(6266981950l);
		p2.setAddress("Indore");
		p2.setSalary(70000);
		
		Person p3 = new Person();
		p3.setEm_number(333333);
		p3.setEm_name("Anant ");
		p3.setEm_mo_number(7977959871l);
		p3.setAddress("Indore");
		p3.setSalary(61000);
		
		Person a[] = new Person[3];
		a[0] = p1;
		a[1] = p2;
		a[2] = p3;
		
		for(int i=0; i<a.length; i++){
		System.out.println(a[i].getEm_number());
		System.out.println(a[i].getEm_name());
		System.out.println(a[i].getEm_mo_number());
		System.out.println(a[i].getAddress());
		if(a[i].getSalary()>50000)
		{
		System.out.println(a[i].getSalary());
		}
		System.out.println();
		}
	}
		
}