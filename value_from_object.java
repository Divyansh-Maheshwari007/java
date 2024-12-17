
// object se method ko call karna or value dena 
class person 
{
int id;
String name;

void set(int i, String n)
{
id = i;
name = n;
}
void display()
{
System.out.println(id +" and "+name);
}
}
class value_from_object
{
public static void main(String [] args)
{
person obj1 = new person();
obj1.set(102,"abc");
obj1.display();
person obj2 = new person();
obj2.set(104,"divyansh");
obj2.display();
}

}