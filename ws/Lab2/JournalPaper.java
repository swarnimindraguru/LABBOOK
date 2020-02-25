package Lab2;

public class JournalPaper extends WrittenItem {
	
	private int journalPublishedyear;
	private String journalAuthor;
	
	public JournalPaper(int journalPublishedyear, String journalAuthor,String authorName,int authorAge,int id,String title,int noOfCopies)
	{
		super(authorName,authorAge,id,title,noOfCopies);
		this.journalAuthor=journalAuthor;
		this.journalPublishedyear=journalPublishedyear;
	}

	public int getJournalPrice() {
		return journalPublishedyear;
	}

	

	public String getJournalAuthor() {
		return journalAuthor;
	}


}
