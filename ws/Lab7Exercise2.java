package Lab7;
import java.util.*;
public class CharacterCount {

	public static void main(String[] args) {
		
		CharacterCount characterCount=new CharacterCount();
		characterCount.countEachCharacter("swarnimindraguru");
	}
	
	public void countEachCharacter(String name)
	{
		Map<Character,Integer>map=new HashMap<>();
		
		char array[]=name.toCharArray();
		
		for(int i=0;i<array.length;i++)
		{
			if(map.containsKey(array[i]))
			{
				map.put(array[i],map.get(array[i])+1);
			}
			else
			{
				map.put(array[i], 1);
			}
		}
		
		System.out.println(map);
		
		
	}

}
