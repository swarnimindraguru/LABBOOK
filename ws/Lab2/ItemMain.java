package Lab2;

public class ItemMain {
	
public static void main(String[] args) {
		
		ItemMain itemMain=new ItemMain();
		
		VideoCD vcd=new VideoCD(1,"Java Complete reference",5,4,"Nageswarrao","M",1997);
		
		AudioCD acd=new AudioCD(1,"English songs",10,6,"Arjit Singh","M");
		
		Book book=new Book("Java Black Body",400,"Nageswar",45,1,"Java Complete reference",5);
		
		JournalPaper journalPaper=new JournalPaper(1998,"Author","Amitabh",70,1,"Java Complete reference",5); 
		
		Item itemArray[]=new Item[4];
		itemArray[0]=vcd;
		itemArray[1]=acd;
		itemArray[2]=book;
		itemArray[3]=journalPaper;
		
		
		
		
		
		itemMain.display(itemArray);

	}
	
	public void display(Item [] itemArray)
	{
		for(int i=0;i<itemArray.length;i++)
		{
			Item item=itemArray[i];
			ItemMain itemMain=new ItemMain();
			if(item instanceof VideoCD)
			{
			    	
			    	VideoCD vcd=(VideoCD)item;
			    	itemMain.display(vcd);
			}
			else if(item instanceof AudioCD)
			{
				
		    	AudioCD acd=(AudioCD)item;
		    	itemMain.display(acd);
		}
			
			else if(item instanceof Book)
			{
				
		    	Book book=(Book)item;
		    	itemMain.display(book);
		}
			
			else
			{
				
				JournalPaper journalPaper=(JournalPaper)item;
		    	itemMain.display(journalPaper);
		
			}
			
		}
		
	}
	
	public void display(VideoCD vcd)
	{
		System.out.println(vcd.getDirector()+" "+vcd.getGenre()+" "+vcd.getYear());
	}
	public void display(AudioCD acd)
	{
		System.out.println(acd.getArtist()+" "+acd.getGenre());
	}
	public void display(Book book)
	{
		System.out.println(book.getAuthorName()+" "+book.getAuthorAge()+" "+book.getBookName()+" "+book.getBookPrice());
	}
	public void display(JournalPaper journalPaper)
	{
		System.out.println(journalPaper.getJournalAuthor()+" "+journalPaper.getJournalPrice());
	}


}
