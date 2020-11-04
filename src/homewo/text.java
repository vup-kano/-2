package homewo;
import java.util.Scanner;
public class text {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();		
		LinearEquation lc= new LinearEquation(a,b,c,d,e,f);
		if(lc.isSolvable()==true) {
			System.out.println("x= "+lc.getX()+" y= "+lc.getY());
		}
		else
			System.out.println("The equation has no solution");

	}

}
