package in.ineuron.assignmentfourth;

public class MaximumOccuringCharacter {
	
		static char MaxOccurChar(String str)
		{
			int count[] = new int[256];
			int length = str.length();
			for (int i = 0; i < length; i++)
			{
				count[str.charAt(i)]++;
			}
			int max = -1; 
			char result = ' '; 

			for (int i = 0; i < length; i++) 
			{
				if (max < count[str.charAt(i)]) 
				{
					max = count[str.charAt(i)];
					result = str.charAt(i);
				}
			}
			return result;
		}

		public static void main(String[] args)
		{
			String string = "Jayesh Gaikwad";
			System.out.println("Maximum Occurring Character is : "+ MaxOccurChar(string));
		}
	}

	


