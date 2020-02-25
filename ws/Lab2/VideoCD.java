package Lab2;

public class VideoCD extends MediaItem {
	
	private String director;
	private String genre;
	private int year;
	
	public VideoCD(int id,String title,int noOfCopies,int n,String director,String genre,int year)
	{
		super(id,title,noOfCopies,n);
		this.director=director;
		this.genre=genre;
		this.year=year;
		
	}

	public String getDirector() {
		return director;
	}

	
	public String getGenre() {
		return genre;
	}

	

	public int getYear() {
		return year;
	}

	

}
