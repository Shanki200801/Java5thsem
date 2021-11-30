import demopackage1.DemoPack;//refer DemoPack code
class MoreDemo extends DemoPack{
	protected String variable2="This is a protected variable within package";
	String variable3="This is a private-package variable within package";
	private String variable4="This is a private-package variable within package";
}
public class AccessDemo {
	public static void main(String[] args) {
		DemoPack.public_method();
		MoreDemo obj1= new MoreDemo();
		System.out.println(obj1.variable2);
		System.out.println(obj1.variable3);	
		//System.out.println(obj1.variable3);(not accessible)
		//obj1.proc_Method();(not accessible)
		//obj1.priv_method();(not accessible)
	}

}
