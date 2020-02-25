package Lab7;

public class SecondSmallest {

	public static void main(String[] args) 
		{
		SecondSmallest search=new SecondSmallest();
			int array[]= {21,26,45,51,77,46,93,47,79};
			System.out.println(search.getSecondSmallest(array));
		}
		
		public int getSecondSmallest(int array[])
		{
			for(int i=0;i<array.length-1;i++)
				for(int j=i;j<array.length;j++)
				{
					if(array[i]>array[j])
					{
						int temp=array[j];
						array[j]=array[i];
						array[i]=temp;
					}
				}
			
			
			int max=array[array.length-1];
			int secondMax=0;
			for(int i=0;i<array.length;i++)
			{
				if(max>array[i])
				{
					secondMax=array[i];
				}
			}
			return secondMax;
			
			
		}


	

}
