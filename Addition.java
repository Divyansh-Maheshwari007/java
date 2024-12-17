class sum
{
int a,b,c;
void set(int a ,int b)
{
this.a = a;
this.b = b;
}
void calculate()
{
c = a + b;
}
int show ()
{
return c;
}
}
class Addition
{
public static void main(String args[])
{
sum obj1 = new sum();
obj1.set(100,200);
obj1.calculate();
int w = obj1.show();
System.out.println(w);
}

}