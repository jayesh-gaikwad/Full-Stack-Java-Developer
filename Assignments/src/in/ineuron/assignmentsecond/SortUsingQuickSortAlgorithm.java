package in.ineuron.assignmentsecond;

class MyClass3
{
	int part(int arr[],int low,int high)
	{
		int pivot=arr[(low+high)/2];
		
		while(low<=high)
		{
			while(arr[low]<pivot)
			{
				low++;
			}
			while(arr[high]>pivot)
			{
				high--;
			}
			if(low<=high)
			{
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;

				low++;
				high--;
			}
		}
		return low;	
	}
	
	void quickSortRecursion	(int arr[],int low, int high)
	{
		int value=part(arr,low,high);
		if(low<value-1)
		{
			quickSortRecursion(arr,low,value-1);
		}
		if(value<high)
		{
			quickSortRecursion(arr,value,high);
		}
	}
	
	static void display(int arr[])
	{
		for(int numbers:arr)
		{
			System.out.print(numbers+" ");
		}
	}

}

public class SortUsingQuickSortAlgorithm {

	public static void main(String[] args) {
		
		int arr[]= {6,5,7,2,1,8,9};
		int length=arr.length;
		MyClass3 myclass=new MyClass3();
		myclass.quickSortRecursion(arr, 0, length-1);
		MyClass3.display(arr);
	}	
}
