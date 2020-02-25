package Lab7;
import java.util.*;
public class Squares {

	public static void main(String[] args) {
		
		Squares sq=new Squares();
		sq.execute();

	}
	
	void execute()
	{
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		
		Map<Integer,Integer>map=getSquares(array);
		
		Set<Map.Entry<Integer, Integer>> entries=map.entrySet();
		for(Map.Entry<Integer,Integer> entry:entries)
		{
			Integer key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println("key is "+key+" Value is "+value);
		}
		
		
		
	}
	
	public Map<Integer,Integer> getSquares(int array[])
	{
		Map<Integer,Integer>map=new HashMap<>();
		
		for(int i=0;i<array.length;i++)
		{
			map.put(array[i],array[i]*array[i]);
		}
		
		return map;
	}

}
