import java.util.Scanner;
public class Quadractic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the coeffecients of quadractic eq");	
		double a= sc.nextDouble();
		double b= sc.nextDouble();
		double c= sc.nextDouble();
		double d= b*b-4*a*c;
		if(d>0.0) {
			double r1=(-b+Math.pow(d, 0.5))/(2.0*a);
			double r2=(-b-Math.pow(d, 0.5))/(2.0*a);
			System.out.println("The roots of the equation are "+r1+" and "+r2);
		}
		else if(d==0.0) {
			double r1=-b/(2*a);
			System.out.println("The root of the equation is "+r1);			
		}
		else {
			System.out.println("The roots are not real");
		}
	}

}
