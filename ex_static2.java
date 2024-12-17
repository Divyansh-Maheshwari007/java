class person
{
	void m1()
	{
		m2();
		System.out.println(" non static m1");
	}
		void m2()
	{
		m3();
		System.out.println(" non static m2");
	}	
 	   static void m3()
	{
		m4();
		System.out.println("  static m3");
	}	
	    static void m4()
	{
		//m2(); we cannot call non - static in static 
		System.out.println(" static m4");
	}
}

class ex_static2{
	public static void main(String [] args){
		person p1 = new person();
		p1.m1();
		p1.m2();
		person.m3();
		p1.m3();
		person.m4();
		
	}
}