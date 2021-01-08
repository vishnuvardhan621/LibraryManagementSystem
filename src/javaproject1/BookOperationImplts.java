package javaproject1;
import java.util.ArrayList;
import java.util.Collections;


public class BookOperationImplts implements BookOperations 
{
	 private static ArrayList<Book> bookList=new ArrayList<>();
		@Override
		public void addBook(Book book) {
			
			bookList.add(book);
			System.out.println("book added successfully....");
			
			
		}

		@Override
		public ArrayList<Book> searchBookTitle(String bookTitle) {
			
			ArrayList<Book> searchedList = new ArrayList<Book>();
			
			for(int i=0;i<=bookList.size()-1;i++)
			{
				Book retrievedBook=bookList.get(i);
				String title=retrievedBook.getBookTitle();
				if(title.equals(bookTitle))
				{
					searchedList.add(retrievedBook);
				}
			}
			if(searchedList.size()==0)
			{
				throw new BookNotFoundException();
			}
			else 
			{
				return searchedList;
			}
			
				
			}

		@Override
		public ArrayList<Book> searchBookType(String bookType) {
			// TODO Auto-generated method stub
			ArrayList<Book> searchedList = new ArrayList<Book>();
			for(int i=0;i<=bookList.size()-1;i++)
			{
				Book retrievedBook=bookList.get(i);
				String type=retrievedBook.getBookType();
				if(type.equals(bookType))
				{
					searchedList.add(retrievedBook);
				}
			}
			if(searchedList.size()==0)
			{
				throw new BookNotFoundException();
			}
			else 
			{
				return searchedList;
			}
		}

		@Override
		public ArrayList<Book> searchBookAuthor(String bookAuthor) {
		
			ArrayList<Book> searchedList = new ArrayList<Book>();
			for(int i=0;i<=bookList.size()-1;i++)
			{
				Book retrievedBook=bookList.get(i);
				String author=retrievedBook.getBookAuthor();
				if(author.equals(bookAuthor))
				{
					searchedList.add(retrievedBook);
				}
			}
			if(searchedList.size()==0)
			{
				throw new BookNotFoundException();
			}
			else 
			{
				return searchedList;
			}
		}

		@Override
		public Book searchBookId(int bookId) {
			Book book = null;
			int status=0;
			for(int i=0;i<=bookList.size()-1;i++)
			{
				Book retrievedBook=bookList.get(i);
				int id=retrievedBook.getBookId();
				
				if(id==bookId)
				{
					status=1;
					book=retrievedBook;
				}
			}
			if(status==0)
			{
				throw new BookNotFoundException();
			}
			return book;
			
			
		}

		@Override
		public void removeBook(int bookId) {
			int status=0;
			for(int i=0;i<=bookList.size()-1;i++)
			{
				Book retrievedBook=bookList.get(i);
				int id=retrievedBook.getBookId();
				if(id==bookId)
				{
					status=1;
					bookList.remove(i);
					System.out.println("book is removed....");
				}
			}
			if(status==0)
			{
				throw new BookNotFoundException();
			}
			
		}

		@Override
		public void updateBookPrice(int bookId, double bookPrice) {
			int status=0;
			for(int i=0;i<=bookList.size()-1;i++)
			{
				Book retrievedBook=bookList.get(i);
				int id=retrievedBook.getBookId();
				
				
				if(id==bookId)
				{
					System.out.println("before updating price..."+retrievedBook);
					status=1;
					retrievedBook.setBookPrice(bookPrice);
					bookList.set(i, retrievedBook);
					System.out.println("after updating price..."+retrievedBook);
				}
			}
			if(status==0)
			{
				throw new BookNotFoundException();
			}
			
		}

		@Override
		public  ArrayList<Integer> getBookIds() {
			ArrayList<Integer> bookIds=new ArrayList<Integer>();
			for(int i=0;i<=bookList.size()-1;i++)
			{ 
				Book book=bookList.get(i);
				int id=book.getBookId();
				bookIds.add(id);
				
			}
			return bookIds;
			
		}

		@Override
		public void getBookInfo() {
			for(int i=0;i<=bookList.size()-1;i++)
			{ 
				Book book=bookList.get(i);
				System.out.println(book);
			}
		
			
		}
		

		@Override
		public void sortBooks(int choice) {
			if(choice==1)
			{
				BookIdCompare bid=new BookIdCompare();
				Collections.sort(bookList,bid);
				System.out.println("books are sorted according to id");
			}
			else if(choice==2)
			{
				BookTitleCompare bTitle=new BookTitleCompare();
				Collections.sort(bookList,bTitle);
				System.out.println("books are sorted according to title");
			}
			else if(choice==3)
			{
				BookTypeCompare bType=new BookTypeCompare();
				Collections.sort(bookList,bType);
				System.out.println("books are sorted according to type");
			}
			else if(choice==4)
			{
				BookPriceCompare bPrice=new BookPriceCompare();
				Collections.sort(bookList,bPrice);
				System.out.println("books are sorted according to price");
			}
			


		}
		

	}
