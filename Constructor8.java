// Object parameterized constructor with product
class Product
{
	private int product_number;
	private String product_name;
	private double product_price;
	private String product_type;
	
	public int getProduct_number()
	{
		return product_number;
	}
	public String getProduct_name()
	{
		return product_name;
	}
	public double getProduct_price()
	{
		return product_price;
	}
	public String getProduct_type()
	{
		return product_type;
	}
	 Product(Product s)
	{
		System.out.println(" Object Parameterized");
		this.product_number = s.product_number;
		this.product_name = s.product_name;
		this.product_price =s.product_price;
		this.product_type = s.product_type;
	}
	Product(int product_number,String product_name,double product_price,String product_type)
	{
		this.product_number=product_number;
		this.product_name=product_name;
		this.product_price=product_price;
		this.product_type=product_type;
	}
	
	void display()
	{
		System.out.println(product_number+" "+product_name);
		System.out.println(product_price+" "+product_type);
	}
}

class Constructor8{
	public static void main(String args[])
	{
		Product obj1 = new Product(101,"H&M",999.99,"Cloths");
		obj1.display();
		Product obj2 = new Product(obj1);
		obj2.display();
	}
	
}