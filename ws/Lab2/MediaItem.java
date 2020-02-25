package Lab2;

public abstract class MediaItem extends Item{
	
private int n;
	
	
	public MediaItem(int id,String title,int noOfCopies,int n)
	{
		super(id,title,noOfCopies);
		this.n=n;
	}
	
	
	public int getN() {
		return n;
	}

}
