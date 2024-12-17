// use of this keywords
class person 
{
int id;
String name;

void set(int id, String name)
{
this.id = id;
this.name = name;
}
void display()
{
System.out.println(id +" and "+name);
}
}
class this_keyword 
{
public static void main(String [] args)
{
person obj1 = new person();
obj1.set(102,"abc");
obj1.display();

}

}