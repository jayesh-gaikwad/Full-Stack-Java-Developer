package in.ineuron.assignmentfourth;

public class CheckPallindromeOrNot {

	public static void main(String[] args) {
		
		int number=2552;
		int sum=0,r;
		int temp=number;
		while(number>0)
		{
			r=number%10;
			sum=(sum*10)+r;
			number=number/10;
		}
		if(temp==sum)
		{
			System.out.println("2552 is Pallindrome");
		}
		else
		{
			System.out.println("2552 is not Pallindrome");
		}

	}

}
