package tejas.model.bookshelf;

public class Book {

	private String bookName;
	private Author author;
	private String price;
	private Dimension dimension;
	private String pages;
	private CharSequence isbn_13;
	private RATING rating;
	private boolean isDelete;
	
	public Book(String bookName, Author author, String price, Dimension dimension, String pages, CharSequence isbn_13,
			RATING rating) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.dimension = dimension;
		this.pages = pages;
		this.isbn_13 = isbn_13;
		this.rating = rating;
		this.isDelete = false;
	}
	

	public Book(String bookName, Author author, String price) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}


	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public CharSequence getIsbn_13() {
		return isbn_13;
	}

	public void setIsbn_13(CharSequence isbn_13) {
		this.isbn_13 = isbn_13;
	}

	public RATING getRating() {
		return rating;
	}

	public void setRating(RATING rating) {
		this.rating = rating;
	}
	

	public boolean isDelete() {
		return isDelete;
	}


	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}


	@Override
	public String toString() {
	    return "{"
	            + "\"bookName\": \"" + bookName + "\", "
	            + "\"author\": \"" + author + "\", "
	            + "\"price\": " + price + ", "
	            + "\"dimension\": \"" + dimension + "\", "
	            + "\"pages\": " + pages + ", "
	            + "\"isbn_13\": \"" + isbn_13 + "\", "
	            + "\"rating\": " + rating
	            + "}";
	}
	
}
