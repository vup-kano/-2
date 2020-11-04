package homewo;
import java.util.Scanner;
public class quardtext {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("qin su ru sang ge shu:");
		double a =input.nextDouble();
		double b =input.nextDouble();
		double c =input.nextDouble();
		QuadraticEquation ec=new QuadraticEquation(a,b,c);
		if(ec.getDiscriminant()<0) System.out.println("The equation has no roots");
		else if(ec.getDiscriminant()==0) System.out.println("r1=r2="+ec.getRoot1());
		else System.out.println(" r1= "+ec.getRoot1()+" r2= "+ec.getRoot2());
	}

}
