package in.ineuron.assignmentsecond;

class MergeSort
{
	int arr[];
	int length;
	int temp[];
	
	
	public void mergeSort(int[] input) {
		this.arr=input;
		this.length=input.length;
		this.temp=new int[length];
		divideArray(0,length-1);
	}
	
	public void divideArray(int lower, int higher) {
		
		if(lower<higher)
		{
			int mid=lower+(higher-lower)/2;
			
			divideArray(lower,mid);
			
			divideArray(mid+1,higher);	
			
			mergeArray(lower,mid,higher);
		}
		
	}
	
	public void mergeArray(int lower,int mid,int higher)
	{
		for(int i=lower;i<=higher;i++)
		{
			temp[i]=arr[i];
		}
		
		int i=lower;
		int j=mid+1;
		int k=lower;
		
		while(i<=mid && j<=higher)
		{
			if(temp[i]<=temp[j])
			{
				arr[k]=temp[i];
				i++;
			}
			else
			{
				arr[k]=temp[j];
				j++;	
			}
			k++;
		}
		
		while(i<=mid)
		{
			arr[k]=temp[i];
			k++;
			i++;
		}
	}	
}


public class SortUsingMergeSortAlgorithm {

	public static void main(String[] args) {
		
		int input[]= {20,68,78,22,6,49,5};
		MergeSort mergesort=new MergeSort();
		mergesort.mergeSort(input);
		
		for(int numbers:input)
		{
			System.out.print(numbers+" ");
		}
	}
}

