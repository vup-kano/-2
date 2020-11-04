package homewo;

public class QuadraticEquation {
     private double a,b,c;
     public QuadraticEquation(double a,double b,double c){
    	 this.setA(a);
    	 this.setB(b);
    	 this.setC(c);
     }
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getDiscriminant() {
		return b*b-4*a*c ;
	}
	public  double getRoot1() {
		double s=0;
		if(getDiscriminant()>=0) { s=(-b+Math.sqrt(getDiscriminant()))/(2*a);}
		return s;
	}
	public  double getRoot2() {
		double s=0;
		if(getDiscriminant()>=0) { s=(-b-Math.sqrt(getDiscriminant()))/(2*a);}
		return s;
	}
}
