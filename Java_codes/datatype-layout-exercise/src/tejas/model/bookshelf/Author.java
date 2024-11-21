package tejas.model.bookshelf;

import java.util.Set;

public class Author {


	private String nameOfAuthor;
	private Set<String> bookSet;
	
	
	public Author(String authorName) {
		this.nameOfAuthor = authorName;
	}
	
	public String getNameOfAuthor() {
		return this.nameOfAuthor;
	}

	public Set<String> getBookSet(){
		return this.bookSet;
	}
	
	
	public void setNameOfAuthor(String nameOfAuthor) {
		this.nameOfAuthor = nameOfAuthor;
	}

	public void setBookSet(Set<String> bookSet) {
		this.bookSet = bookSet;
	}

	public String toString() {
		return this.nameOfAuthor;
	}
}
