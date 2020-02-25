package Lab2;

public class Book extends WrittenItem {
	
	private String bookName;
	private int bookPrice;
	
	public Book(String bookName, int bookPrice,String authorName,int authorAge,int id,String title,int noOfCopies)
	{
		super(authorName,authorAge,id,title,noOfCopies);
		this.bookName=bookName;
		this.bookPrice=bookPrice;
	}

	public String getBookName() {
		return bookName;
	}

	
	public int getBookPrice() {
		return bookPrice;
	}

}
