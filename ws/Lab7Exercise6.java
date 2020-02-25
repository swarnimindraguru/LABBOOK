package Lab7;
import java.util.*;
public class Voting {

	Map<String,Integer>map=new HashMap<String,Integer>();
	public static void main(String[] args) {
		
		Voting voting=new Voting();
		voting.execute();

	}
	
	void execute()
	{
		
		map.put("ABC",23);
		map.put("PQR",15);
		map.put("XYZ",18);
		
		List<String> list=voterList();
		System.out.println("Citizen Eligible for Vote are: ");
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
	}
	
	public List<String> voterList()
	{
		List<String> list=new ArrayList<String>();
		
		Set<Map.Entry<String,Integer>> entries=map.entrySet();
		for(Map.Entry<String,Integer> entry:entries)
		{
			String key=entry.getKey();
			int value=entry.getValue();
			
			if(value>=18)
			{
				list.add(key);
			}
		}
		return list;
	}

}
