import java.util.Scanner;
public class SimpleCalc {
	static float calculate(float a, float b, char c) {
		float ans = 0;
		switch(c) {
		case '+': ans=a+b;
				  break;
		case '-': ans=a-b;
				  break;
		case '*': ans=a*b;
				  break;
		case '/': ans=a/b;
				  break;
		default: System.out.println("Invalid option");
				 break;
		}
		return ans;
	}
	public static void main(String[] args) {
		System.out.println("Enter 2 numbers to operate on");
		Scanner sc= new Scanner(System.in);
		float a= sc.nextFloat();
		float b= sc.nextFloat();
		System.out.println("Choose 1 option\n"
							+ "+ for addition\n"
							+ "- for subtraction\n"
							+ "* for multiplication\n"
							+ "/ for division");
		char operator= sc.next().charAt(0);
		if(operator=='+'||operator=='-'||operator=='*'||operator=='/') {
		System.out.println("Answer = "+calculate(a,b,operator));}
		else {System.out.println("Invalid option selected");}
	}

}
