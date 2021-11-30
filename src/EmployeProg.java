import java.util.Scanner;
class employee{
	String employeID, empName;
	double basic_sal, HRA=0.25, DA=0.5, CCA=240, PF=0.1,PT=100,gross_sal,net_sal;	
	public void read() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter employee ID");
		employeID=sc.nextLine();
		System.out.println("Enter employee name");
		empName=sc.nextLine();
		System.out.println("Enter basic salary");
		basic_sal=sc.nextDouble();
	}
	public void calculate() {
		gross_sal=basic_sal+basic_sal*HRA+basic_sal*DA+basic_sal*PF+CCA;
		net_sal=gross_sal-PT-basic_sal*PF;
	}
	public void display(){
		System.out.println("Employee name: "+empName+"\nEmployee ID: "+employeID);
		System.out.println("Basic salary: "+basic_sal+"\nGross salary: "+gross_sal+"\nNet salary: "+net_sal);
	}
}
public class EmployeProg {

	public static void main(String[] args) {
		employee first=new employee();
		first.read();
		first.calculate();
		first.display();

	}}
