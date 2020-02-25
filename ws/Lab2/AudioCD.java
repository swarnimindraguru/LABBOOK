package Lab2;

public class AudioCD extends MediaItem {
	
	private String artist;
	private String genre;
	
	public AudioCD(int id,String title,int noOfCopies,int n, String artist,String genre)
	{
		super(id,title,noOfCopies,n);
		this.artist=artist;
		this.genre=genre;
		
	}

	public String getArtist() {
		return artist;
	}

	

	public String getGenre() {
		return genre;
	}

}
