package ClassAssignment;

import java.util.Scanner;

class iNeuron{
	
	int n=7;
	
	void A(){
		// For Letter A
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j==0&&i!=0||i==0&&j!=0&&j!=n-1||i==(n-1)/2||j==n-1&&i!=0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		System.out.println(" ");
		}
	}

	void B(){
		// For Letter B
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == (n - 1) / 2 || j == (n - 1) || i == (n - 1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}
			
	}
	
	void C(){
		// For Letter C
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == (n - 1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}
		
	}
	
	void D() {
		// For Letter D
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j < (n - (n - 1) / 4) || j == 0 || i == (n - 1) && j < (n - (n - 1) / 4)
						|| j == n - 1 && i != 0 && i != n - 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}
		
		
	}
	
	void E() {
		// For Letter E
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || i == (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}	
	}
	
	void F() {
		// For Letter F
		
	}
	
	void G() {
		// For Letter G
		
	}
	
	void H() {
		// For Letter H
		
	}
	
	void I() {
		// For Letter I
		
	}
	
	void J() {
		// For Letter J
		
	}
	
	void K() {
		// For Letter K
		
	}
	
	void L() {
		// For Letter L
		
	}
	
	void M() {
		// For Letter M
		
	}
	
	void N() {
		// For Letter N
		
	}
	
	void O() {
		// For Letter O
		
	}
	
	void P() {
		// For Letter P
		
	}
	
	void Q() {
		// For Letter Q
		
	}
	
	void R() {
		// For Letter R
		
	}
	
	void S() {
		// For Letter T
		
	}
	void T() {
		// For Letter T
		
	}
	void U() {
		// For Letter V
		
	}
	
	void V() {
		// For Letter V
		
	}
	
	void W() {
		// For Letter W
		
		
	}
	
	void X() {
		// For Letter X
		
	}
	
	void Y() {
		// For Letter Y
		
	}
	
	void Z() {
		// For Letter Z
		
	}
}




public class AllLetters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String strObj=sc.next();
		strObj=strObj.toUpperCase();
		
		iNeuron aveng=new iNeuron();
		for(int i=0;i<strObj.length();i++)
		{
			switch(strObj.charAt(i))
			{
				case 'A':
					aveng.A();
					System.out.println(" ");
					break;
				case 'B':
					aveng.B();
					System.out.println(" ");
					break;
				case 'C':
					aveng.C();
					System.out.println(" ");
					break;
				case 'D':
					aveng.D();
					System.out.println(" ");
					break;
				case 'E':
					aveng.E();
					System.out.println(" ");
					break;
				case 'F':
					aveng.F();
					System.out.println(" ");
					break;
				case 'G':
					aveng.G();
					System.out.println(" ");
					break;
				case 'H':
					aveng.H();
					System.out.println(" ");
					break;
				case 'I':
					aveng.I();
					System.out.println(" ");
					break;
				case 'J':
					aveng.J();
					System.out.println(" ");
					break;
				case 'K':
					aveng.K();
					System.out.println(" ");
					break;
				case 'L':
					aveng.L();
					System.out.println(" ");
					break;
				case 'M':
					aveng.M();
					System.out.println(" ");
					break;
				case 'N':
					aveng.N();
					System.out.println(" ");
					break;
				case 'O':
					aveng.O();
					System.out.println(" ");
					break;
				case 'P':
					aveng.P();
					System.out.println(" ");
					break;
				case 'Q':
					aveng.Q();
					System.out.println(" ");
					break;
				case 'R':
					aveng.R();
					System.out.println(" ");
					break;
				case 'S':
					aveng.S();
					System.out.println(" ");
					break;
				case 'T':
					aveng.T();
					System.out.println(" ");
					break;
				case 'U':
					aveng.U();
					System.out.println(" ");
					break;
				case 'V':
					aveng.V();
					System.out.println(" ");
					break;
				case 'W':
					aveng.W();
					System.out.println(" ");
					break;
				case 'X':
					aveng.X();
					System.out.println(" ");
					break;
				case 'Y':
					aveng.Y();
					System.out.println(" ");
					break;
				case 'Z':
					aveng.Z();
					System.out.println(" ");
					break;
				default:
					System.out.println("Not a character");
					break;
					
			}
		}
		

	}

}
