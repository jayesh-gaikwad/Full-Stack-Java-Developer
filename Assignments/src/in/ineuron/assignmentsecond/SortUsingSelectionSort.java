package in.ineuron.assignmentsecond;

class SelectionSort
{
	static public void selectionSort()
	{
		int arr[]= {10,68,98,15,45,86,78};
		
		int min,temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

public class SortUsingSelectionSort {

	public static void main(String[] args) {
		
		SelectionSort.selectionSort();
	}

}
