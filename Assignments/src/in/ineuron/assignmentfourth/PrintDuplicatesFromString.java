package in.ineuron.assignmentfourth;

public class PrintDuplicatesFromString {

	public static void main(String[] args) {
		
		String str="Enterprise Java";
		char arr[]=str.toCharArray();
		System.out.println("The given string is:"+str);
		System.out.println("Duplicates Characters in given string are:");
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[j]+ " ");
					break;
				}
			}
		}
	}
	
}
