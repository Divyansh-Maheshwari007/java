class A
{
	int a;
	void getS1()
	{
	System.out.println("I am Base class");
	}
	void getD()
	{
	System.out.println("I am Base class for D class");
	}
}
class B extends A
{
	int b;
	void getS2()
	{
	System.out.println("I am B class");
	a=25;
	b=5;
	System.out.println("B class = "+a+b);
	}
	void getB1()
	{
	System.out.println("Not Call");
	}
}
class C extends B
	{
	void getS3()
	{
	System.out.println("I am C class");
	}
	}
class D extends A	
	{
	void getS3()
	{
	System.out.println("I am D class");
	}
	}

class Hybrid	
{
public static void main(String[] ar)
{
C s1 = new C();
D d1 = new D();
s1.getS1();
s1.getS2();
s1.getS3();
d1.getS3();
d1.getD();
}
}