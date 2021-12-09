import java.util.Scanner;
public class Powercalc {
	public static void main(String[] args) {
		System.out.println("Enter your base and power ");
		Scanner sc= new Scanner(System.in);
		int b=sc.nextInt();
		int e=sc.nextInt();
		double ans=Math.pow(b,e);
		System.out.println(b+" raised to "+e+ " is "+ans);
	}
}
