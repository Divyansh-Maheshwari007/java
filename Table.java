import java.util.Scanner;
class Table{


public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter Start number = ");
int s = sc.nextInt();
System.out.print("Enter End number = ");
int e = sc.nextInt();

for(int i=s;i<=e;i++){

for(int j=1;j<=10;j++){
System.out.println(i+"*"+j+" = "+i*j);
}
System.out.println();
}
}
}