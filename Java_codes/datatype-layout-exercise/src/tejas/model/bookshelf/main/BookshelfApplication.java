package tejas.model.bookshelf.main;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import tejas.model.bookshelf.Author;
import tejas.model.bookshelf.Book;
import tejas.model.bookshelf.Dimension;
import tejas.model.bookshelf.RATING;
import tejas.model.bookshelf.exceptions.BookNotFoundException;
import tejas.model.utils.DataUtils;

public class BookshelfApplication {

	public static void main(String[] args) {

		/*
		 * create application where we can give user option
		 * 
		 * to add Book Update Book
		 * 
		 * get list of books - all list - by particular authors - by rating - by price
		 * range delete book - remove from list
		 */
		System.out.println("\t|| o ||  SHREE GAJANAN PRASANNA || o ||\t");

		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			List<Book> books = DataUtils.getBookList();
			while (!exit) {

				System.out.println(
						"------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("Enter Appropriate Option:");
				System.out.println("Press 1 Add New Book To Library:");
				System.out.println("Press 2 Remove New Book To Library:");
				System.out.println("Press 3 Update Book To Library:");
				System.out.println("Press 4 Get Book List From Library:");
				System.out.println("Press 0 To Exit...");
				System.out.println(
						"------------------------------------------------------------------------------------------------------------------------------------------------------");

				int option = sc.nextInt();
				sc.nextLine();

				switch (option) {
				case 0:

					exit = true;
					break;
				case 1:
					addNewBook(books ,sc);
					break;
				case 2:
					System.out.println("Book Name :");
					String bookname = sc.nextLine();
					boolean found = false;
					for (Book book : books) {
						if (book.getBookName().equalsIgnoreCase(bookname)) {
							book.setDelete(true);
							found = true;
						}
					}
					System.out.println(found ? "DELETED :" + bookname : "Book \'" + bookname + "\' Not Found");
					break;
				case 3:
					showBooks(books);
					updateBookFromList(books,sc);
					break;
				case 4:
					showBooks(books);
					break;
				default:
					System.out.println("Entered Invalid Option");
					break;
				}

			}

		} catch (Exception e) {
			 e.printStackTrace();
		}
	}

	private static void addNewBook(List<Book> books ,Scanner sc) {
		System.out.println("Book Name :");
		String name = sc.nextLine();

		for (Book book : books) {
			if (book.getBookName().equals(name)) {
				System.out.println("BOOK : " + name + "ALREADY EXIST");
				break;
			}
		}
		System.out.println("Author :");
		String author = sc.nextLine();
		System.out.println("Enter Price:");
		String price = "INR " + sc.next();
		System.out.println("Enter Length :");
		float length = sc.nextFloat();
		System.out.println("Enter width :");
		float width = sc.nextFloat();
		System.out.println("Enter height :");
		float height = sc.nextFloat();
		System.out.println("Enter unit of above:");
		String unit = sc.next();
		System.out.println("ISBN_13 :");
		String isbn_13 = sc.next();
		System.out.println("pages :");
		String pages = sc.next();
		System.out.println("Enter Rating:");
		int rating = sc.nextInt();

		Book newBook = new Book(name, new Author(author), price, new Dimension(length, width, height, unit),
				pages, isbn_13, RATING.fromValue(rating));
		books.add(newBook);

		System.out.println("ADDED BOOK SUCCESSFULLY TO LIBRARY");
		
	}

	private static void updateBookFromList(List<Book> books,Scanner sc) {

		System.out.println("Select Book  By Entering Name");
		String bookUpdate = sc.nextLine();
		for (Book book : books) {
			if (book.getBookName().equalsIgnoreCase(bookUpdate)) {
				System.out.println("Please select field you want to update : ");
				System.out.printf("\n\t\t%-20s  %-20s   %-20s   %-20s   %-20s  %-20s%n", "1.Book Name", "2.Author",
						"3.Price", "4.Rating", "5.Dimension", "6.Pages");
				int selectedNum = sc.nextInt();
				sc.nextLine();
				switch (selectedNum) {
				case 1:
					System.out.println("Enter Updated Book Name :");
					String bookname = sc.nextLine();
					updateBookName(book, bookname);
					break;
				case 2:
					// update book name
					System.out.println("Enter Updated Author :");
					String authorName = sc.nextLine();

					updateBookAuthor(book, authorName);
					break;

				case 3:
					System.out.println("Enter Updated Price :");
					String price = sc.nextLine();
					updatePriceOfBook(book, price);
					break;
				case 4:
					System.out.println("Enter Updated Rating :");
					int rating = sc.nextInt();
					updateRatingOfBook(book, rating);

					break;
				case 5:
					System.out.println("Enter Updated Dimension :");
					updateBookDimension(book,sc);
					break;
				case 6:
					System.out.println("Enter Updated Pages :");
					String pages = sc.next();
					updatePagesOfBook(book, pages);
					break;
				default:
					System.out.println("Invalid Option While Updating");
					break;
				}
			}
		}

	}

	private static void updatePagesOfBook(Book book, String pages) {
		book.setPages(pages);
		System.out.println("UPDATED BOOK PAGES : " + book.getPages());
	}

	private static void updateBookDimension(Book book, Scanner sc) {
		
			System.out.println("Enter Length :");
			float length = sc.nextFloat();
			System.out.println("Enter width :");
			float width = sc.nextFloat();
			System.out.println("Enter height :");
			float height = sc.nextFloat();

			book.getDimension().setHeight(height);
			book.getDimension().setWidth(width);
			book.getDimension().setLength(length);
			System.out.println("UPDATED BOOK DIMENSION : " + book.getDimension());

	}

	private static void updateRatingOfBook(Book book, int rating) {
		book.setRating(RATING.fromValue(rating));
		System.out.println("UPDATED BOOK RATING : " + book.getRating());
	}

	private static void updatePriceOfBook(Book book, String price) {
		book.setPrice(price);
		System.out.println("UPDATED BOOK PRICE : " + book.getPrice());
	}

	private static void updateBookAuthor(Book book, String authorName) {

		book.getAuthor().setNameOfAuthor(authorName);
		System.out.println("UPDATED BOOK AUTHOR : " + book.getAuthor());
	}

	private static void updateBookName(Book book, String bookname) {
		System.out.println("Enter Updated Bookname :");
		book.setBookName(bookname);
		System.out.println("UPDATED BOOK NAME : " + book.getBookName());
	}

	public static void showBooks(List<Book> books) {
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("\t%-20s |  %-20s |  %-10s |  %-10s |  %-35s | %-10s| %-20s%n", "Book Name", "Author",
				"Price", "Rating", "Dimension", "Pages", "isbn-13");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------");

		for (Book book : books) {
			if (book.isDelete() == false) {
				System.out.printf("\t%-20s |  %-20s |  %-10s |  %-10s |  %-35s | %-10s| %-20s%n", book.getBookName(),
						book.getAuthor(), book.getPrice(), book.getRating(), book.getDimension(), book.getPages(),
						book.getIsbn_13());
			}
		}
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------");

	}

}
