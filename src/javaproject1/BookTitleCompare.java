package javaproject1;
import java.util.Comparator;
public class BookTitleCompare implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Book book1=(Book)o1;
		Book book2=(Book)o2;
		String title1=book1.getBookTitle();
		String title2=book2.getBookTitle();
		int res=title1.compareTo(title2);
		return res;
		}

	
	
}
