package com.xworkz.heirarchy;

public class LongBook {

	public void Book(Book book) {
		
		System.out.println(book.name);
		book.open();
		
		if(book instanceof ShortBook) {
			ShortBook shortbook=(ShortBook)book;
			System.out.println(shortbook.noOfPages);
			shortbook.read();
		}
	}
}
