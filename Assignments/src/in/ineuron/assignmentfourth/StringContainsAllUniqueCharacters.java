package in.ineuron.assignmentfourth;

import java.util.Arrays;

public class StringContainsAllUniqueCharacters {

	public static boolean checkAllUnqiueChar(String str) 
	{
	        char[] array = str.toCharArray();
	        Arrays.sort(array);
	        for (int i = 1; i < array.length; ++i) {
	            if (array[i] == array[i-1]) {
	                return false;
	            }
	        }
	        return true;
	 }
	public static void main(String[] args) 
	{
			String str = "Jayesh";
			System.out.println("Given String : "+str);
			System.out.println("String having all unique characters: "+checkAllUnqiueChar(str));
	}		
}



