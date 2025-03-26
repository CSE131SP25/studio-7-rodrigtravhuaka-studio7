package studio7;

public class Die {
	private int n; 
	public static void main(String[] args) {
		Die D1 = new Die (10); 
		System.out.println(D1.integer());
	}
	public Die (int sides) {
		 n = sides;
	}
	public int integer() {
		return (int)(Math.random()*n + 1);
	}
}
