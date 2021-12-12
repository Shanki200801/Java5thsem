abstract class firstparent{
	abstract void display();
}
class secondparent extends firstparent{
	void display() {
		System.out.println("This demonstrates abstract methods and classes");
	}
	static void display2() {
		System.out.println("This demonstrates static methods");
	}
}
final class thirdparent extends secondparent{
	final static void display2() {
		System.out.println("This demonstrates final classes and final methods");
	}
}
public class AbsStaFi {
	public static void main(String[] args) {
		thirdparent obj= new thirdparent();
		secondparent.display2();
		thirdparent.display2();
		obj.display();
	}
}
