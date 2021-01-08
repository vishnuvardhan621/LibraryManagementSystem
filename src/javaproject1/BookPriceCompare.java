package javaproject1;
import java.util.Comparator;
public class BookPriceCompare implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
	{
			Book book1=(Book)o1;
			Book book2=(Book)o2;
			if(book1.getBookPrice()>book2.getBookPrice())
			{
				return 1;
			}
			else if(book1.getBookPrice()<book2.getBookPrice())
			{
				return -1;
			}
			else {
			return 0;
			}
		}
}
