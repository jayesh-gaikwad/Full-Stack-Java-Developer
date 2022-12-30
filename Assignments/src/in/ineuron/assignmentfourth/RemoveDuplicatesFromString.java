package in.ineuron.assignmentfourth;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		
		String str="Jayesh Dattatray Gaikwad";
		System.out.println("The given string is: "+str);
		System.out.println("After removing duplicate from string: "+removeDuplicateChararaters(str));

	}

	private static String removeDuplicateChararaters(String str) {
		
		char arr[]=str.toCharArray();
		String outputStr="";
		
		for(char character:arr)
		{
			if(outputStr.indexOf(character)==-1)
			{
				outputStr=outputStr+character;
			}
		}
		return outputStr;
	}

}
