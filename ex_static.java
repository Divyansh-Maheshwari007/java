class person
{
int id;
String name;
static int pid;
void set(int id, String name, int pid)
{
this.id = id;
this.name = name;
this.pid = pid;
}
void display()
{
System.out.println(id +" and "+name+" and "+pid);
}
}
class ex_static{
public static void main(String [] args)
{
person p1 = new person();
p1.set(101,"Rashmika",11);
p1.display();
person p2 = new person();
p2.set(102,"Katappa",88);
p2.display();
p1.display();

}
}