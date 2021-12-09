import java.util.Scanner;
public class SIandCI {
	static double interest(float p, float r, float t){
		double SI=p*r*t/100;
		return (SI);
	}
	static double interest(float p,float r, float t,float n) {
		r=r/100;
		double a= p * Math.pow(1 + (r / n), n * t);
		return (a-p);
	}
	public static void main(String[] args) {
		int option=0;
		float p,r,t,n;
		Scanner sc= new Scanner(System.in);	
		System.out.println("Choose your option\n 1. Simple interest\n 2. Compound interest\n 3. Exit");	
		while(option<4) {
		option=sc.nextInt();
		switch(option) {
		case 1:  System.out.println("Enter principle, Rate and Time to calculate SI");
				 p=sc.nextFloat();
				 r=sc.nextFloat();
				 t=sc.nextFloat();
				 System.out.println("Simple interest is "+interest(p,r,t));
				 break;
		case 2:  System.out.println("Enter principle, Rate, time and yield time in months");
		 		 p=sc.nextFloat();
		 		 r=sc.nextFloat();
		 		 t=sc.nextFloat();
		 		 n=sc.nextFloat();
		 		 System.out.println("Compound interest is "+interest(p,r,t,n));
		 		 break;
		case 3:  System.exit(0);
				 break;
		default: System.out.println("Invalid option selected");
				 option=0;
				 break;
				 
			}
		}
	}

}
