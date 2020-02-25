package Lab7;
import java.util.*;
public class Lab7Exercise1 {

	public static void main(String[] args) {
		
		Map<Integer,Integer> map=new HashMap<>();
		
		map.put(1,5);
		map.put(2,3);
		map.put(3,1);
		map.put(4,2);
		map.put(5,4);
		
		MapEx mapEx=new MapEx();
		
		List<Integer> list=mapEx.getValues(map);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
	
	public List<Integer> getValues(Map<Integer,Integer>map)
	{
		List<Integer> list=new ArrayList<>();
		
		int size=map.size();
		
		for(int i=1;i<=size;i++)
		{
			list.add(map.get(i));
		}
			
		Collections.sort(list);
		
		return list;	
	}

}
