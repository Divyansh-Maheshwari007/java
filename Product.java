class Person
{
	private int id;
	private String brand;
	private double price;
	private String type;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public double getPrice()
	{
		return price;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public String getType()
	{
		return type;
	}
	
}
class Product{
	public static void main(String [] args)
	{
		Person p1 = new Person();
		p1.setId(1001);
		p1.setBrand("Zudio");
		p1.setPrice(999.99);
		p1.setType("Cloths");
		
		Person p2 = new Person();
		p2.setId(2002);
		p2.setBrand("H & M");
		p2.setPrice(1999.99);
		p2.setType("Cars");
		
		Person p3 = new Person();
		p3.setId(3003);
		p3.setBrand("Relaince");
		p3.setPrice(2999.99);
		p3.setType("All type");
		
		Person a[] = new Person[3];
		a[0] = p1;
		a[1] = p2;
		a[2] = p3;
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i].getId());
			System.out.println(a[i].getBrand());
			System.out.println(a[i].getPrice());
			System.out.println(a[i].getType());
			System.out.println();
		}
	}
		
}