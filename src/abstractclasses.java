abstract class shape2{
	int dim1;
	int dim2;
	shape2(int x,int y){
		dim1=x;
		dim2=y;
	}
	public abstract void Area();
}
class rectangle2 extends shape2{
	rectangle2(int x, int y){
		super(x,y);
	}
	public void Area() {
		System.out.println("Area of rectangle2 of given dimensions is "+dim1*dim2);
	}
}
class triangle2 extends shape2{
	triangle2(int x, int y){
		super(x,y);
	}
	public void Area() {
		System.out.println("Area of triangle2 of given dimensions is "+0.5*dim1*dim2);
	}
}
public class abstractclasses {

	public static void main(String[] args) {
		rectangle2 obj1= new rectangle2(30, 10);
		triangle2 obj2= new triangle2(30, 10);
		obj1.Area();
		obj2.Area();

	}

}
