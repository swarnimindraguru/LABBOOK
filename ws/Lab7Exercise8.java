package Lab7;
import java.util.*;
public class Unique {

	public static void main(String[] args) {
		
		Unique Unique=new Unique();
		int array[]= {1,1,2,3,4,5,6,5,3,2,1,4,5,3,8,9,1,1,1,1};
		int crray[]=Unique.modifyArray(array);
		
		for(int i:crray)
		{
			System.out.println(i);
		}

	}
	
	public int[] modifyArray(int[]array)
	{
		ArrayList<Integer>list=new ArrayList<>();
		for(int i=0;i<array.length;i++)
		{
			if(list.contains(array[i])==false)
			{
				list.add(array[i]);
			}
			
		}
		int n=list.size();
		int brray[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			brray[i]=(Integer)list.get(i);
		}
		return brray;
		
		
	}

}
