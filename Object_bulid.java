// How to bulid a object in a class 
class person{
  int id;
  String name;
  
  void set()
  {
   id = 10;
   name = "abc";
  }
  void display()
  {
	System.out.println(id +" and "+ name);
  }
}
class Object_bulid{
public static void main(String [] args)
{
person obj = new person();
obj.set();
obj.display();
person obj1 = new person();
obj1.set();
obj1.display();
}
}