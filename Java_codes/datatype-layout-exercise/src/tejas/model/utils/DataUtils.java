package tejas.model.utils;

import java.util.ArrayList;
import java.util.List;

import tejas.model.bookshelf.Author;
import tejas.model.bookshelf.Book;
import tejas.model.bookshelf.Dimension;
import tejas.model.bookshelf.RATING;

public class DataUtils {

	public static List<Book> getBookList() {
		List<Book> books  =  new ArrayList<>();
		books.add( new Book("Sapiens",new Author("Yuval Noah Harari"),"INR 550",new Dimension(1.3f,2.4f,0.24f,"cm"),"220","dfae33",RATING.fromValue(4)));
		books.add( new Book("The Book of Life" ,new Author("J Krishnamurti"),"INR 450",new Dimension(2.3f,1.4f,0.24f,"cm"),"450","dfae33",RATING.fromValue(4)));
		books.add( new Book("Siddhartha" ,new Author("Hermann Hesse"),"INR 150",new Dimension(2.3f,1.4f,0.24f,"cm"),"150","dfae33",RATING.fromValue(4)));

		return books;
		
	}
}
