package javaproject1;
import java.util.*;
public class Librarian extends Thread
{
	static Scanner scan =new Scanner(System.in);
	public static void performBookOperation() throws InputMismatchException
	{
			BookOperations bookOperations=BookManager.getBookOperations();
			
			
			System.out.println("press 1 to add a book......");
			System.out.println("press 2 to search a book based on book title......");
			System.out.println("press 3 to search a book based on book type......");
			System.out.println("press 4 to search a book based on book author......");
			System.out.println("press 5 to search a book based on book id......");
			System.out.println("press 6 to remove a book......");
			System.out.println("press 7 to update a book's price......");
			System.out.println("press 8 to get book ids......");
			System.out.println("press 9 to get book information......");
			System.out.println("press 10 to sort all books......");
			
			System.out.println("enter your choice...");
			
		
				
				int	choice=scan.nextInt();
		
			if(choice==1)
			{
				System.out.println("enter the book id....");
				int bookId=scan.nextInt();
				System.out.println("enter the book title....");
				String bookTitle=scan.next();
				System.out.println("enter the book author....");
				String bookAuthor=scan.next();
				System.out.println("enter the book type....");
				String bookType=scan.next();
				System.out.println("enter the book price....");
				double bookPrice=scan.nextDouble();
				Book book=new Book(bookId, bookTitle, bookAuthor, bookType, bookPrice);
				bookOperations.addBook(book);
			}
			else if(choice==2)
			{ 
				System.out.println("enter the book title....");
				String bookTitle=scan.next();
				try
				{
					ArrayList<Book> retrievedBookList=bookOperations.searchBookTitle(bookTitle);
				
					Iterator<Book> iterateRetrievedBookList=retrievedBookList.iterator();
					while(iterateRetrievedBookList.hasNext())
					{
						System.out.println(iterateRetrievedBookList.next());
					}
				}
				catch(BookNotFoundException exp)
				{
					System.out.println(exp);
				}
				
			}
			else if(choice==3)
			{ 
				System.out.println("enter the book type....");
				String bookType=scan.next();
				try
				{
					ArrayList<Book> retrievedBookList=bookOperations.searchBookTitle(bookType);
				
					Iterator<Book> iterateRetrievedBookList=retrievedBookList.iterator();
					while(iterateRetrievedBookList.hasNext())
					{
						System.out.println(iterateRetrievedBookList.next());
					}
				}
				catch(BookNotFoundException exp)
				{
					System.out.println(exp);
				}
				
			}
			else if(choice==4)
			{ 
				System.out.println("enter the book author....");
				String bookAuthor=scan.next();
				try
				{
					ArrayList<Book> retrievedBookList=bookOperations.searchBookTitle(bookAuthor);
				
					Iterator<Book> iterateRetrievedBookList=retrievedBookList.iterator();
					while(iterateRetrievedBookList.hasNext())
					{
						System.out.println(iterateRetrievedBookList.next());
					}
				}
				catch(BookNotFoundException exp)
				{
					System.out.println(exp);
				}
				
			}
			else if(choice==5)
			{
				System.out.println("enter the book id....");
				int bookId=scan.nextInt();
				try
				{
					System.out.println(bookOperations.searchBookId(bookId));
					
					
				}
				catch(BookNotFoundException exp)
				{
					System.out.println(exp);
				}
				
			}
			else if(choice==6)
			{
				System.out.println("enter the book id which you want to remove....");
				int bookId=scan.nextInt();
				try
				{
					bookOperations.removeBook(bookId);
					
				}
				catch(BookNotFoundException exp)
				{
					System.out.println(exp);
				}
				
			}
			else if(choice==7)
			{
				System.out.println("enter the book id which you want to update....");
				int bookId=scan.nextInt();
				System.out.println("enter the new book price....");
				double bookPrice=scan.nextDouble();
				try
				{
					bookOperations.updateBookPrice(bookId, bookPrice);
					
				}
				catch(BookNotFoundException exp)
				{
					System.out.println(exp+"so price can't be updated");
				}
				
			}
			else if(choice==8)
			{
				try 
				{
					ArrayList<Integer> retrievedBookIds=bookOperations.getBookIds();
					for(int i=0;i<=retrievedBookIds.size()-1;i++)
					{
						System.out.println(retrievedBookIds.get(i));
					}
				}
				catch(BookNotFoundException exp)
				{
					System.out.println(exp);
				}
			}
		
			else if(choice==9)
			{
				bookOperations.getBookInfo();
			}
			else if(choice==10)
			{
				System.out.println("press 1 to sort according to id");
				System.out.println("press 2 to sort according to title");
				System.out.println("press 3 to sort according to type");
				System.out.println("press 4 to sort according to price");
				int ch=scan.nextInt();
				bookOperations.sortBooks(ch);
			}
		else
		{
			System.out.println("invalid input");
		}
			
	}
	
	public void run()
	{	int choice=0;
		System.out.println("welcome to the library");
		do
		{
			
			
				performBookOperation();						
			System.out.println("press 1 to continue....");
			System.out.println("press 0 to exit the library....");
			choice=scan.nextInt();
			
		}while(choice==1);
		System.out.println("thank you visit us again");
	}
}
