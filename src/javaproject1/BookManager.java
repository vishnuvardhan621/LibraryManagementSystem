package javaproject1;

public class BookManager 
{
	public static BookOperations getBookOperations()
	{
		BookOperations bookOperations=new BookOperationImplts();
		return bookOperations;
	}

}
