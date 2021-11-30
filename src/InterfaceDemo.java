import java.util.Scanner;
interface ArthOp{
	void addition(int a, int b);
	void subtraction(int a, int b);
	void multiplication(int a, int b);
	void division(int a, int b);
}
public class InterfaceDemo implements ArthOp {

	public void addition(int a, int b) {
		System.out.println("Sum is "+(a+b));
	}
	public void subtraction(int a, int b) {	
		System.out.println("difference is "+(a-b));
	}
	public void multiplication(int a, int b) {
		System.out.println("Product is "+a*b);
	}
	public void division(int a, int b) {	
		System.out.println("Integer quotient is "+(a/b));
	}
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		InterfaceDemo obj=new InterfaceDemo();
		obj.addition(a,b);
		obj.multiplication(a, b);
		obj.subtraction(a, b);
		obj.division(a, b);
	}
}
