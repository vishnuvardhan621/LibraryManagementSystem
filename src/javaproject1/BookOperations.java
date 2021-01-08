package javaproject1;
import java.util.ArrayList;
public interface BookOperations
{
	void addBook(Book book);
	ArrayList<Book> searchBookTitle(String bookTitle);
	ArrayList<Book> searchBookType(String bookType);
	ArrayList<Book> searchBookAuthor(String bookAuthor);
	Book searchBookId(int bookId);
	void removeBook(int bookId);
	void updateBookPrice(int bookId,double bookPrice);
	ArrayList<Integer> getBookIds();
	void getBookInfo();
	void sortBooks(int choice);
}
