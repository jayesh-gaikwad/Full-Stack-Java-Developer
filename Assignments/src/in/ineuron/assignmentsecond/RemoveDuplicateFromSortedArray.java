package in.ineuron.assignmentsecond;

class MyClass
{
	void removeDuplicateElements()
	{
		int arr[]= {1,2,3,3,5,6};
		
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j]=arr[i];
				j++;
			}
		}
		arr[j]=arr[arr.length-1];
		
		for(int i=0;i<j+1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
}
public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		
		MyClass myclass=new MyClass();
		
		myclass.removeDuplicateElements();
		

	}

}
