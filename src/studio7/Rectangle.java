package studio7;

public class Rectangle {

	private double w;
	private double l;
	public static void main(String[] args) {
		
		Rectangle R1 = new Rectangle (3,5); 
		Rectangle R2 = new Rectangle (4,4);
		System.out.println(R1.Area());
		System.out.println(R2.Parameter()); 
		System.out.println(R1.Square());
		System.out.println(R2.Square());
		System.out.println(R1.compareArea(R2.l, R2.w));
	}
	public Rectangle (double width, double length) {
		w = width; 
		l = length; 
		
	}
	public double Area () {
		return w*l; 
	}
	public double Parameter() { 
		return ((2*w) + (2*l)); 
	}
	public boolean compareArea(double otherLength, double otherWidth) {
		if (this.l*this.w > otherLength*otherWidth) {
			return true; 
		}else {
			return false; 
		}
	}
	
	public boolean Square() {
		if (w == l) {
			return true; 
		} else {
			return false;
		}
	}
}
