/*
CRICKET SCOREBOARD
create a class named Delivery with the following private attributes
1. over - long
2. ball - long
3. runs - long
4. batsman - String
5. nonStriker - String

Create another class named Main and include a main method to test the above class.
imput format :
The first line consists of a long that represents over.
the second line consists of a long that represents the ball.
the third line consists of a long that represents the runs.
the fourth line consists of a String the represents a batsman.
The next line consists of a String that represents a bowler.
the next line consists of a String represents a nonStriker.

Output format :
The output should display delivery details.
sample test cases :
Input 1 : 
1
1
4 
Dhoni
Dale Steyn
Suresh Raina
Output 1:
over : 1 
Ball : 1 
Runs : 4 
Batsman : Dhoni
Bowler : Dale Steyn
Non Striker : Suresh Raina

Input 2 : 
10
4 
45 
Jadeja
pat Cummins
Axar patel
output 2 : 
Over : 10
Ball : 4 
runs : 45
Batsman : jadeja
bowler : pat cummins
Non Striker : Axar patel  
*/
import java.util.*;
class Delivery
{
	private long over;
	private long ball;
	private long runs;
	private String batsman;
	private String nonStriker;
	private String bowler;
	
	public long getOver()
	{
		return over;
	}
	public long getBall()
	{
		return ball;
	}
	public long getRuns()
	{
		return runs;
	}
	public String getBatsman()
	{
		return batsman;
	}
	public String getNonstriker()
	{
		return batsman;
	}
	public String getBowler()
	{
		return bowler;
	}
	Delivery(long over,long ball,long runs,String batsman,String nonStriker,String bowler)
	{
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.nonStriker = nonStriker;
		this.bowler = bowler;
	}
		void display()
		{
		System.out.println("Over : "+over);
		System.out.println("Ball : "+ball);
		System.out.println("Runs : "+runs);
		System.out.println("Batsman     : "+batsman);
		System.out.println("Non-Striker : "+nonStriker);
		System.out.println("Bowler      : "+bowler);
		}
}


class Cricket{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter over : ");
		int o = sc.nextInt();
		System.out.println("Enter Ball : ");
		int b = sc.nextInt();
		System.out.println("Enter Runs : ");
		int r = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Batsman name : ");
		String B = sc.nextLine();
		System.out.println("Enter Bowler name : ");
		String Bo = sc.nextLine();
		System.out.println("Enter Non Striker : ");
		String n = sc.nextLine();
		Delivery d1 = new Delivery(o,b,r,B,Bo,n);
		d1.display();
		
		System.out.println("Enter over : ");
		int o1 = sc.nextInt();
		System.out.println("Enter Ball : ");
		int b1 = sc.nextInt();
		System.out.println("Enter Runs : ");
		int r1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Batsman name : ");
		String B1 = sc.nextLine();
		System.out.println("Enter Bowler name : ");
		String Bo1 = sc.nextLine();
		System.out.println("Enter Non Striker : ");
		String n1 = sc.nextLine();
		Delivery d2 = new Delivery(o1,b1,r1,B1,Bo1,n1);
		d2.display();
	}
}