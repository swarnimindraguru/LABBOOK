package Lab2;

public abstract class WrittenItem extends Item {

	private String authorName;
	private int authorAge;
	
	public WrittenItem(String authorName,int authorAge,int id,String title,int noOfCopies)
	{
		super(id, title,noOfCopies);
		this.authorAge=authorAge;
		this.authorName=authorName;
		
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getAuthorAge() {
		return authorAge;
	}

	public void setAuthorAge(int authorAge) {
		this.authorAge = authorAge;
	}
	
	
	
	
}
