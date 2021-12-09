class principle{
	double princi= 10000;
}
class rate extends principle{
	double r= 10;
}
class time extends rate{
	double t= 5.0;
}
class display extends time{
	void print()
	{System.out.println("The principle is "+princi);
	 System.out.println("The rate is "+r);
	 System.out.println("The time is "+t);
	}}
public class SiInherit extends time{
public static void main(String[] args) {
	SiInherit obj= new SiInherit();
	double si=obj.princi * obj.r *obj.t/100;
	display obj2= new display();
	obj2.print();
	System.out.println("The simple interest is "+si);
	}
}