import java.util.Scanner;
public class MethodOverloadDemo {
	double Area(double base, double height) {
		return(0.5*base*height);
	}
	double Area(double side) {
		return(side*side);
	}
	void Area() {
		System.out.println("No arguments passed");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MethodOverloadDemo cal=new MethodOverloadDemo();
		System.out.println("Enter side of square");
		double s=sc.nextDouble();
		
		System.out.println("Enter base and height of triangle");
		double b=sc.nextDouble();
		double h=sc.nextDouble();
		System.out.println("Area of square= "+cal.Area(s));
		System.out.println("Area of triangle= "+cal.Area(b,h));

	}

}
