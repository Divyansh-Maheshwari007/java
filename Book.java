/*
Task 1: Defining a class
create a class named Book to represnt books in a library.
The class should have the following attributes(fields):

title (String) - to store the title of the book.
author (String) - to store the author's name.
price (double)  - to store the price of the book.
quantity (int0 - to store the number of copies availabe.
Include the following methods:

A constructor is initialize the title, author , price, and quantity
A methods displayDetails() that prints all the details of the book.

Task 2 Creating a objects
inside the main methods:
Create three book objects with different details.
call the displayDetails() methods for each objects to display the books information
*/
class Booklibrary
{
	private String title;
	private String author;
	private double price;
	private int quantity;
	
	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	public double getPrice()
	{
		return price;
	}
	public int getQuantity()
	{
		return quantity;
	}
	Booklibrary(String title, String author, double price, int quantity)
	{
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	void display()
	{
		System.out.println(" Book details ");
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
		System.out.println(quantity);
	}
	
}

class Book{
	public static void main(String args[])
	{
		Booklibrary b1 = new Booklibrary("Black box","Divyansh",9999.9,1);
		b1.display();
		Booklibrary b2 = new Booklibrary("13 Swing","Pankaj ladha",599.5,2);
		b2.display();
		Booklibrary b3 = new Booklibrary("50 Candle","Pushkraj Thakur",398.43,3);
		b3.display();
	}
}