class Base{

double a = 3.14;

public void getArea(double radius){
double b = a*radius*radius;
System.out.println("Area = "+b);

}
public void getB1(){
System.out.println("Base class");
}

}

class Drive1 extends Base{

public void getCircum(int r){
 getArea(r);
}
class Drive2 extends Base{

public void getCircum(int r){

System.out.println("I am Drive 2 from Base class"); 
getArea(r); 
}
 public static void main(String []args){
Drive1 d = new Drive1();
d.getCircum(2);

Drive2 d = new Drive2();
d.getCircum(2);
}

}
