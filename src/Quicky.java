import testpack.*;
public class Quicky {

	public static void main(String[] args) {
		int a;
		QuickCmd obj=new QuickCmd();
		System.out.println("Enter a number");
		a=obj.scanint();
		System.out.println(a);
	}

}
