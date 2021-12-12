abstract class shape{
	public void Area(int dim1,int dim2) {
	}
}
class rectangle extends shape{
	public void Area(int dim1,int dim2) {
		System.out.println("Area of rectangle of given dimensions is "+dim1*dim2);
	}
}
class triangle extends shape{
	public void Area(int dim1,int dim2) {
		System.out.println("Area of triangle of given dimensions is "+0.5*dim1*dim2);
	}
}
public class overriding {

	public static void main(String[] args) {
		rectangle obj1= new rectangle();
		triangle obj2= new triangle();
		obj1.Area(5, 4);
		obj2.Area(5, 4);

	}

}
