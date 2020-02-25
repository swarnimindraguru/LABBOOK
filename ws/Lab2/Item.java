package Lab2;

public abstract class Item {
	
	private int id;
	private String title;
	private int noOfCopies;
	
	public Item(int id,String title,int noOfCopies)
	{
		this.id=id;
		this.title=title;
		this.noOfCopies=noOfCopies;
		
	}

	public int getId() {
		return id;
	}

	

	public String getTitle() {
		return title;
	}

	

	public int getNoOfCopies() {
		return noOfCopies;
	}

	
	
	public boolean equals(Object o)
	{
		return true;	
	}
	
	
	public String toString()
	{
		return "";
	}
	
	
	
	
	

}
