package com.xworkz.Runner;

import com.xworkz.heirarchy.Book;
import com.xworkz.heirarchy.LongBook;
import com.xworkz.heirarchy.ShortBook;

public class BookRunner {

	public static void main(String[] args) {
		
		LongBook longbook=new LongBook();
		
		Book book=new Book();
		longbook.Book(book);
		
		ShortBook shortbook=new ShortBook();
		longbook.Book(shortbook);
	}

}
