package oops;
public class UseLibrary{
	public static void main(String[] args) {
		Book book=new Book();
		book.name="fly";
		book.page=150;
		Library libr=new Library();
		libr.libraryType="public";
		libr.location="chennai";
		libr.book=book;
		System.out.println(libr.libraryType);
		System.out.println(libr.book.name);
		
	}
}

 class Library {
	String libraryType;
	String location;
	Book book;
	
		
	}
 class Book{
	String name;
	int page;
	
}
 
