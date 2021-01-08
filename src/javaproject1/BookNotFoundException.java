package javaproject1;

public class BookNotFoundException  extends RuntimeException
{
	@Override
	public String toString() {
		return "Book is not avilable in the library";
	}
}
