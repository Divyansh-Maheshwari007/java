class A
{
int id = 50;
}
class B extends A
{
int id = 90;
}
class Demo
{
public static void main(String args[])
{
System.out.println("Main start");
B obj = new B(); 
A obj1 = new B(); 
System.out.println(obj.id);
System.out.println(obj1.id);
}
}