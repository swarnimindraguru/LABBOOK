package Lab7;
import java.util.Arrays;

public class ReverseSortArray {

	public static void main(String[] args) {
		
		ReverseSortArray reverseSortArray=new ReverseSortArray();
		int array1[]= {11,34,56,87,98,59,41,19,50};
		
		int array[]=reverseSortArray.getSorted(array1);
		
		for(int i:array)
			System.out.print(i+" ");

	}
	
	public int[] getSorted(int array[])
	{
		
		for(int i=0;i<array.length;i++)
		{
			int rem=0;
			int rev=0;
			int k=array[i];
			while(k>0)
			{
				rem=k%10;
				rev=rev*10+rem;
				k=k/10;
			}
			array[i]=rev;
		}
		Arrays.sort(array);
		return array;
	}

}
