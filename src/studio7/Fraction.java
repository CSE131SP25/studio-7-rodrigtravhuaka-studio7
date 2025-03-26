package studio7;

public class Fraction {
	private int D; 
	private int N; 

	public static void main(String[] args) {
		Fraction F1 = new Fraction (3,4);
		Fraction F2 = new Fraction (6,7); 
		System.out.println(F1.AddFractionNum(F2.N, F2.D)+ "/" + F1.AddFractionDenom(F2.D));
		System.out.println(F1.MultFracNum(F2.N) + "/" + F1.MultFracDenom(F2.D));
		System.out.println(F1.recip()); 

	}
	private Fraction (int numerator, int denominator) {
		D = denominator; 
		N = numerator; 
	}
	private int AddFractionNum(int otherN, int otherD) { 
		return ((this.N * otherD) + (this.D * otherN)); 
	}
	private int AddFractionDenom(int otherD) {
		return (this.D * otherD); 
	}
	private int MultFracNum(int otherN) {
		return (this.N * otherN); 
	}
	private int MultFracDenom(int otherD) {
		return (this.D * otherD);
	}
	private String recip() { 
		return D + "/" + N; 
	}


}
