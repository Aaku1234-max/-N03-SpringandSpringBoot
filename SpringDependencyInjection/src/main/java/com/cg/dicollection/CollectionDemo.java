package com.cg.dicollection;

//program to demonstrate that in the form of dependency injections
import java.util.List;
import java.util.Set;

public class CollectionDemo {
	
	private List<String>contactNo;
	private Set<String>books;
	
	//generate setters method
	public void setContactNo(List<String> contactNo) {
		this.contactNo = contactNo;
	}
	public void setBooks(Set<String> books) {
		this.books = books;
	}
	
	public void display()
	{
		System.out.println(" List of Contact no :");
		for(String contact:contactNo)
		{
			System.out.println(contact);
		}
		
		System.out.println(" Set of books :");
		for(String b:books)
		{
			System.out.println(b);
		}
	}
	
	

}