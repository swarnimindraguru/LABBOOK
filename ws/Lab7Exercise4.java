package Lab7;
import java.util.*;
public class Medal {
	Map<Integer,Integer> map=new HashMap<>();
	public static void main(String[] args) {
		
		Medal medal=new Medal();
		medal.execute();

	}
	
	void execute()
	{
		map.put(2,85);
		map.put(1,75);
		map.put(5,93);
		map.put(4,70);
		map.put(3,85);
		Map<Integer,String> resultList=getStudents(map);
		
		Set<Map.Entry<Integer, String>> entries=resultList.entrySet();
		for(Map.Entry<Integer,String> entry:entries)
		{
			Integer key=entry.getKey();
			String value=entry.getValue();
			System.out.println("Registration no. is "+key+" Medal Won is "+value);
		}
		
	}
	
	public Map<Integer,String> getStudents(Map<Integer,Integer> map)
	{
		Map<Integer,String> mapList=new HashMap<>();
		
		
		Set<Map.Entry<Integer, Integer>> entries=map.entrySet();
		for(Map.Entry<Integer,Integer> entry:entries)
		{
			Integer key=entry.getKey();
			Integer value=entry.getValue();
			
			if(value>=90)
			{
				mapList.put(key, "GOLD");
			}
			else if(value>=80 && value<90)
			{
				mapList.put(key, "SILVER");
			}
			else if(value>=70 && value<80)
			{
				mapList.put(key, "BRONZE");
			}
			
		}
		
		
		return mapList;			
	}

}

