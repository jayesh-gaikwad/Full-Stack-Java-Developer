package in.ineuron.assignmentsecond;

import java.util.HashSet;

class MyClass2
{
	void removeDuplicateElements()
	{
		int arr[]= {1,4,2,7,3,4,3,5,7,6,8,9,8};
		
		//HashSet Not allowed any duplicate 
		HashSet<Integer>hs=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		
		for(int number:hs)
		{
			System.out.print(number+" ");
		}	
	}
	
}
public class RemoveDuplicateUsingHashSet {

	public static void main(String[] args) {
		
		MyClass2 myclass=new MyClass2();
		
		myclass.removeDuplicateElements();
	
	}

}
